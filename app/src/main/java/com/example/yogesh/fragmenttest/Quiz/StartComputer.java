package com.example.yogesh.fragmenttest.Quiz;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yogesh.fragmenttest.R;

import java.util.List;

public class StartComputer extends AppCompatActivity {


    Button b1, b2, b3, b4;
    TextView tv1, tv2, tv3, tv4;
    int score =0;
     ComputerQuizHelper computerQuizHelper;
    ComputerQuestion currentQuestion;
    List<ComputerQuestion> list;
    int qid = 0;
    int level = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_computer);

        getSupportActionBar().hide();
        tv1 = (TextView) findViewById(R.id.historyQuestion);
        tv2 = (TextView) findViewById(R.id.triviTimer);
        b1 = (Button) findViewById(R.id.buttonA);
        b2 = (Button) findViewById(R.id.buttonB);
        b3 = (Button) findViewById(R.id.buttonC);
        b4 = (Button) findViewById(R.id.buttonD);
        tv3 = (TextView) findViewById(R.id.level);
        tv4 = (TextView) findViewById(R.id.score);



        CountDownTimer countDownTimer = new CountDownTimer(300 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished ) {
                tv2.setText("Timer:" + millisUntilFinished  / 1000 + " " + "sec");
            }

            @Override
            public void onFinish() {
                tv2.setText("TIME OUT");
                Intent intent = new Intent(getApplicationContext(), timeup.class);
                startActivity(intent);
            }
        };


        countDownTimer.start();
        computerQuizHelper = new ComputerQuizHelper(this);
        SQLiteDatabase sqLiteDatabase = computerQuizHelper.getWritableDatabase();
        computerQuizHelper.allQuestion();
        list = computerQuizHelper.getAllQuestion();
        currentQuestion = list.get(qid);
        view();






    }


    public void view() {
        tv1.setText(currentQuestion.getQuestion());
        b1.setText("A."+currentQuestion.getOpta());
        b2.setText("B."+currentQuestion.getOptb());
        b3.setText("C."+currentQuestion.getOptc());
        b4.setText("D."+currentQuestion.getOptd());
        tv3.setText("Level:"+level);
        tv4.setText("Score:"+score);
    }


    public void ButtonA(View view) {

        if (b1.getText().toString().equals("A."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartComputer.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartComputer.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonB(View view) {
        if (b2.getText().toString().equals("B."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartComputer.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartComputer.this,ResultPlayAgain.class);
            intent.putExtra("xscore",score);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonC(View view) {
        if (b3.getText().toString().equals("C."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartComputer.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartComputer.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    public void ButtonD(View view) {
        if (b4.getText().toString().equals("D."+currentQuestion.getAnswer())){
            score+=5;
            if(qid<19){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(StartComputer.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent=new Intent(StartComputer.this,ResultPlayAgain.class);
            Bundle b=new Bundle();
            b.putInt("xscore",score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
        finish();
    }
}
