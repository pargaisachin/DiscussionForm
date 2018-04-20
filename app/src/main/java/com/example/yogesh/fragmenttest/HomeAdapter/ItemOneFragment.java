package com.example.yogesh.fragmenttest.HomeAdapter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
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
        animalList.add(new Item("Lion",R.drawable.ic_home_black_24dp));
        animalList.add(new Item("Tiger",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Monkey",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Elephant",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Dog",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Cat",R.drawable.ic_dashboard_black_24dp));

        CustomHomeAdapter myAdapter=new CustomHomeAdapter(getContext(),R.layout.fragmenthomegrid,animalList);
        simpleList.setAdapter(myAdapter);
              return  v;

    }


}