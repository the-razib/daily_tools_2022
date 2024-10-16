package com.diu.dailytools;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;

public class Add_New_Note_AndDetails extends AppCompatActivity {

    EditText titteEditText,contentEditText;
    ImageButton saveNote;
    TextView pageTitleTextView;
    String title,content,docId;
    ImageButton noteDelete;

    boolean isEditMode =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note_and_details);

        titteEditText=findViewById(R.id.Note_Title_ID);
        contentEditText=findViewById(R.id.Note_content_ID);
        saveNote=findViewById(R.id.SaveNoteBtnID);
        pageTitleTextView=findViewById(R.id.PageTitleID);

        noteDelete=findViewById(R.id.delete_note_id);

        //recive data from
        title=getIntent().getStringExtra("title");
        content=getIntent().getStringExtra("content");
        docId=getIntent().getStringExtra("docId");

        if (docId!=null && !docId.isEmpty()){
            isEditMode = true;
            noteDelete.setVisibility(View.VISIBLE);
        }

        noteDelete.setOnClickListener(view -> deletNotFromFirebase());

        titteEditText.setText(title);
        contentEditText.setText(content);

        if (isEditMode){
            pageTitleTextView.setText("Edit your note");
        }



    }

    public void SaveNote(View view) {
        String noteTitle= titteEditText.getText().toString();
        String noteContent=contentEditText.getText().toString();

        if (noteTitle.isEmpty()){
            titteEditText.setError("Give Title");
            return;
        }

        NoteModel note =new NoteModel();
        note.setTitle(noteTitle);
        note.setContent(noteContent);
        note.setTimestamp(Timestamp.now());

        // save note to firebase
        saveNoteToFireBase(note);

    }

    void  saveNoteToFireBase(NoteModel note){
        DocumentReference documentReference;
        if (isEditMode){
            //update the note
            documentReference=Utility.getCollectionForAllNote().document(docId);
        }
        else {
            // creat new note
            documentReference=Utility.getCollectionForAllNote().document();

        }
        documentReference.set(note).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    //note is Successfully add
                    Toast.makeText(Add_New_Note_AndDetails.this,"Note Added Successfully",Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    //fail to add note
//                    Toast.makeText(Add_New_Note_AndDetails.this,"Failed Adding Note",Toast.LENGTH_LONG).show();
                    Toast.makeText(Add_New_Note_AndDetails.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    void deletNotFromFirebase(){

        DocumentReference documentReference;
        documentReference=Utility.getCollectionForAllNote().document(docId);

        documentReference.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    //note is Successfully delete
                    Toast.makeText(Add_New_Note_AndDetails.this,"Note Deleted Successfully",Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    //fail to add note
                    Toast.makeText(Add_New_Note_AndDetails.this,"Failed Deleted Note",Toast.LENGTH_LONG).show();
//                    Toast.makeText(Add_New_Note_AndDetails.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}













