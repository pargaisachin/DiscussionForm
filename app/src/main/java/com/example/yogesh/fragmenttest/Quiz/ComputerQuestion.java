package com.example.yogesh.fragmenttest.Quiz;

import android.app.Activity;

public class ComputerQuestion extends Activity {

    private int id;
    private String question;
    private String opta;
    private String optb;
    private String optc;
    private String optd;
    private String answer;

    public ComputerQuestion(String q, String oa, String ob, String oc, String od, String ans) {

        question = q;
        opta = oa;
        optb = ob;
        optc = oc;
        optd = od;
        answer = ans;
    }

    public ComputerQuestion() {
        id = 0;
        question = "";
        opta = "";
        optb = "";
        optc = "";
        optd = "";
        answer = "";
    }


    public String getQuestion() {
        return question;
    }

    public String getOpta() {
        return opta;
    }

    public String getOptb() {
        return optb;
    }

    public String getOptc() {
        return optc;
    }

    public String getOptd() {
        return optd;
    }

    public String getAnswer() {
        return answer;
    }

    public void setId(int i) {
        id = i;
    }

    public void setQuestion(String q1) {
        question = q1;
    }

    public void setOpta(String o1) {
        opta = o1;
    }

    public void setOptb(String o2) {
        optb = o2;
    }

    public void setOptc(String o3) {
        optc = o3;
    }

    public void setOptd(String o4) {
        optd = o4;
    }

    public void setAnswer(String ans) {
        answer = ans;
    }


}

