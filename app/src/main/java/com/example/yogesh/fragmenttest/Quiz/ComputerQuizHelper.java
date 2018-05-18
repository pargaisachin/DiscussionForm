package com.example.yogesh.fragmenttest.Quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 1/4/2017.
 */

public class ComputerQuizHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "DATABASEQUIZHS";
    private static final int DATABASE_VERSION = 17;
    private static final String TABLE_NAME = "HISTORYQUIZ";
    private static final String UID = "_UID";


    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public ComputerQuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }

    public void allQuestion() {
        ComputerQuestion q1 = new ComputerQuestion("What is the maximun number of dimensions an array in C may have?\n", "\n" +
                "Theoratically no limit", "A.\tTwo", "B.\tEight", "C.\tTwenty", "D.\tTheoratically no limit");
        this.insert(q1);
        ComputerQuestion q2 = new ComputerQuestion("  The information about an array used in a program will be sorted in?", "D.\tDope vector\n", "A.\tSymbol table", "B.\tActivation record", "C.\tBoth (a) and (b", "D.\tDope vector");
        this.insert(q2);
        ComputerQuestion q3 = new ComputerQuestion("who was the current president of india ?", "mira kumari", "ram nath kovind", "Naidia Comenci", "Tamara Press", "ram nath kovind");
        this.insert(q3);
        ComputerQuestion q4 = new ComputerQuestion("who was the current president of india ?", "mira kumari", "ram nath kovind", "Naidia Comenci", "Tamara Press", "ram nath kovind");
        this.insert(q4);
        ComputerQuestion q5 = new ComputerQuestion("Who is the Flying Sikh of India ?", "Mohinder Singh", "Joginder Singh", "Ajit Pal Singh", "Milkha singh", "Milkha singh");
        this.insert(q5);
        ComputerQuestion q6 = new ComputerQuestion("The Indian to beat the computers in mathematical wizardry is", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakunthala Devi", "Shakunthala Devi");
        this.insert(q6);
        ComputerQuestion q7 = new ComputerQuestion("Who is Larry Pressler ?", "Politician", "Painter", "Actor", "Tennis player", "Politician");
        this.insert(q7);
        ComputerQuestion q8 = new ComputerQuestion("Michael Jackson is a distinguished person in the field of ?", "Pop Music", "Jounalism", "Sports", "Acting", "Pop Music");
        this.insert(q8);
        ComputerQuestion q9 = new ComputerQuestion("The first Indian to swim across English channel was ?", "V. Merchant", "P. K. Banerji", "Mihir Sen", "Arati Saha", "Mihir Sen");
        this.insert(q9);
        ComputerQuestion q10 = new ComputerQuestion("Who was the first Indian to make a movie?", "Dhundiraj Govind Phalke", " Asha Bhonsle", " Ardeshir Irani", "V. Shantaram", "Dhundiraj Govind Phalke");
        this.insert(q10);
        ComputerQuestion q11 = new ComputerQuestion("Who is known as the ' Saint of the gutters ?", "B.R.Ambedkar", "Mother Teresa", "Mahatma Gandhi", "Baba Amte", "Mother Teresa");
        this.insert(q11);

    }
    public void insert(ComputerQuestion historyQuestion) {
        ContentValues contentvalues = new ContentValues();
       /* contentvalues.put(UID,indiaQuestion.getId());*/
        contentvalues.put(QUESTION, historyQuestion.getQuestion());
        contentvalues.put(OPTA, historyQuestion.getOpta());
        contentvalues.put(OPTB, historyQuestion.getOptb());
        contentvalues.put(OPTC, historyQuestion.getOptc());
        contentvalues.put(OPTD, historyQuestion.getOptd());
        contentvalues.put(ANSWER, historyQuestion.getAnswer());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, contentvalues);
    }
    public List<ComputerQuestion> getAllQuestion() {
        List<ComputerQuestion> que = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        String coloumns[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            ComputerQuestion historyQuestion = new ComputerQuestion();
            historyQuestion.setId(cursor.getInt(0));
            historyQuestion.setQuestion(cursor.getString(1));
            historyQuestion.setOpta(cursor.getString(2));
            historyQuestion.setOptb(cursor.getString(3));
            historyQuestion.setOptc(cursor.getString(4));
            historyQuestion.setOptd(cursor.getString(5));
            historyQuestion.setAnswer(cursor.getString(6));
            que.add(historyQuestion);
        }
        return que;
    }
}
