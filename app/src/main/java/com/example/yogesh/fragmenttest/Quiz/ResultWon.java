package com.example.yogesh.fragmenttest.Quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yogesh.fragmenttest.R;


public class ResultWon extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultwon);
        TextView tv1=(TextView)findViewById(R.id.score2);





    }

    public void PlayAgain1(View view) {
        Intent intent = new Intent(ResultWon.this, QuizMenu.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
