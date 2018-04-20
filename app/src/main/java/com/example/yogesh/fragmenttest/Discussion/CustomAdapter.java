package com.example.yogesh.fragmenttest.Discussion;

/**
 * Created by YOGESH on 4/11/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yogesh.fragmenttest.R;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> animalList = new ArrayList<>();

    public CustomAdapter( Context applicationcontext, int textViewResourceId, ArrayList<Item> objects) {
        super(applicationcontext , textViewResourceId, objects);
        animalList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.fragmentgridview, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        textView.setText(animalList.get(position).getAnimalName());
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        return v;

    }

}