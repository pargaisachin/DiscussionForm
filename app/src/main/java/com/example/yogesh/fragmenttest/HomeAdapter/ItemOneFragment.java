package com.example.yogesh.fragmenttest.HomeAdapter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.yogesh.fragmenttest.ComputerScience.ChatMainActivity;
import com.example.yogesh.fragmenttest.Quiz.QuizMenu;
import com.example.yogesh.fragmenttest.R;

import java.util.ArrayList;


public class ItemOneFragment extends Fragment {
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }
    GridView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_item_one_fragment, container, false);


        simpleList = (GridView)  v.findViewById(R.id.simpleGridView);
        animalList.add(new Item("Quiz",R.drawable.ic_interrogation));
        animalList.add(new Item("Practice",R.drawable.ic_ebook));
        animalList.add(new Item("Tip's",R.drawable.ic_tips));
        animalList.add(new Item("Aboutus",R.drawable.ic_man));

        CustomHomeAdapter myAdapter=new CustomHomeAdapter(getContext(),R.layout.fragmenthomegrid,animalList);
        simpleList.setAdapter(myAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    Intent myIntent = new Intent(view.getContext(), QuizMenu.class);
                    startActivityForResult(myIntent, 0);
                }
                if(i==1)
                {
                    Intent myIntent = new Intent(view.getContext() ,Webviewpdfpaper.class);
                    startActivityForResult(myIntent,1);
                }

                if(i==2)
                {

                    Intent myIntent = new Intent(view.getContext() ,Tips.class);
                    startActivityForResult(myIntent,2);


                }


            }
        });

        return  v;

    }


}