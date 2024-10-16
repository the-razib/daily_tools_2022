package com.diu.dailytools;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.Query;


public class PerSonalNote extends AppCompatActivity {
    FloatingActionButton addNewNote;
    RecyclerView recyclerView;
    NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_sonal_note);

        addNewNote=findViewById(R.id.add_new_note_ID);
        recyclerView=findViewById(R.id.recycler_view);

        addNewNote.setOnClickListener((view)-> startActivity(new Intent(this,Add_New_Note_AndDetails.class)));
        setupRecyclearView();//call here recyclearview method
    }

    void setupRecyclearView(){
        Query query=Utility.getCollectionForAllNote()
                .orderBy("timestamp", Query.Direction.DESCENDING);//latest data come first .creates a Query object that ordering the notes by their timestamp property in descending order.
        FirestoreRecyclerOptions<NoteModel> options= new FirestoreRecyclerOptions
                .Builder<NoteModel>().setQuery(query,NoteModel.class).build();  //creates a FirestoreRecyclerOptions object which contains the query and the NoteModel class.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  // sets the layout manager for the RecyclerView
        noteAdapter= new NoteAdapter(options,this); //creates a new NoteAdapter object and sets it to be the adapter for the RecyclerView
        recyclerView.setAdapter(noteAdapter);  // starts listening for changes to the query


    }

    @Override
    protected void onStart() {
        super.onStart();
        noteAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        noteAdapter.stopListening();
    }

    @Override
    protected void onResume() {
        super.onResume();
        noteAdapter.notifyDataSetChanged();
    }
}