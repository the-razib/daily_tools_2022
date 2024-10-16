package com.diu.dailytools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {
    Context context;
    String[] itemName;
    Integer[] images;

    public CustomAdapter(Context context, String[] itemName, Integer[] images) {
        super(context, R.layout.list_view_custom_row, itemName);
        this.context = context;
        this.itemName = itemName;
        this.images = images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.list_view_custom_row, parent, false);

        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);

        textView.setText(itemName[position]);
        imageView.setImageResource(images[position]);

        return view;
    }
}
