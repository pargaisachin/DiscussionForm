package com.example.yogesh.fragmenttest.Quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.yogesh.fragmenttest.R;

public class QuizMenu extends AppCompatActivity {
    ImageButton sport,india;
    ImageButton history,political,geography,universe,plant,sport1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_menu);
        sport=(ImageButton)findViewById(R.id.sport);
        india=(ImageButton)findViewById(R.id.india);
        history=(ImageButton)findViewById(R.id.history);
        political=(ImageButton)findViewById(R.id.political) ;
        geography=(ImageButton)findViewById(R.id.geography);
        universe=(ImageButton)findViewById(R.id.universe);
        plant=(ImageButton)findViewById(R.id.plant);
        sport1=(ImageButton)findViewById(R.id.sport1);
        getSupportActionBar().hide();




        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),StartQuizIn.class);
                startActivity(i);



            }
        });


        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),StartQuiz.class);
                startActivity(i);



            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),StartComputer.class);
                startActivity(i);


            }
        });
        political.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),StartPolitical.class);
                startActivity(i);



            }
        });
        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        universe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sport1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
