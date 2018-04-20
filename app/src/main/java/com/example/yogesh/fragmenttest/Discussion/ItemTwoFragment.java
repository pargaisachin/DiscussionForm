package com.example.yogesh.fragmenttest.Discussion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.yogesh.fragmenttest.ComputerScience.ChatMainActivity;
import com.example.yogesh.fragmenttest.Discussion.*;
import com.example.yogesh.fragmenttest.Discussion.Item;
import com.example.yogesh.fragmenttest.HomeAdapter.ItemOneFragment;
import com.example.yogesh.fragmenttest.R;

import java.util.ArrayList;

import static com.facebook.FacebookSdk.getApplicationContext;

public class ItemTwoFragment extends Fragment  {

    GridView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();


    public static ItemTwoFragment newInstance() {
        ItemTwoFragment fragment = new ItemTwoFragment();
        return fragment;
    }

    int logos[] = {R.drawable.ic_home_black_24dp, R.drawable.ic_home_black_24dp, R.drawable.ic_home_black_24dp, R.drawable.ic_home_black_24dp};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_item_one_fragment, container, false);


        simpleList = (GridView)  v.findViewById(R.id.simpleGridView);
        animalList.add(new Item("Lion",R.drawable.ic_home_black_24dp));
        animalList.add(new Item("Tiger",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Monkey",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Elephant",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Dog",R.drawable.ic_dashboard_black_24dp));
        animalList.add(new Item("Cat",R.drawable.ic_dashboard_black_24dp));

        CustomAdapter myAdapter=new CustomAdapter(getContext(),R.layout.fragmenthomegrid,animalList);
        simpleList.setAdapter(myAdapter);


        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent a =new Intent(getActivity(),ChatMainActivity.class);
                startActivity(a);


            }
        });
        return  v;



    }

}