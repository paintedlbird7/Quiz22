//TODO fix outcome/display button it opens in a new window with correct but empty checkboxes in app Quiz22
//working expect opens in new window


package com.example.android.quiz2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Map<String, String> questions = new HashMap<String, String>();
    int questionNo = 1;
    TextView outcome;
    TextView question;
    CheckBox answer11;
    CheckBox answer2;
    CheckBox answer3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer11 = (CheckBox) findViewById(R.id.Answer11);
        answer2 = (CheckBox) findViewById(R.id.Answer2);
        answer3 = (CheckBox) findViewById(R.id.Answer3);
        question = (TextView) findViewById(R.id.Question);
        outcome = (TextView) findViewById(R.id.Outcome);
        //outcome setText;

        questions.put("Question1", "What is Kylo Ren's Real Name?");
        questions.put("Right1", "Ben Solo");
        questions.put("WrongA1", "Anakin Skywalker");
        questions.put("WrongB1", "Mr Cuddles");

//        questions.put("Question2", "What color is Darth Maul's light saber?");
//        questions.put("Right2", "Red");
//        questions.put("WrongA2", "Blue");
//        questions.put("WrongB2", "Green");
//
//        questions.put("Question3", "What is the subtitle of Star Wars: Episode IV?");
//        questions.put("Right3", "A New Hope");
//        questions.put("WrongA3", "Return of the Jedi");
//        questions.put("WrongB3", "Mr Puddle's Picnic");

        setQuestion();


    }





    private void setQuestion()     {


        Random r = new Random();
        Object bound;
        int value1 = r.nextInt( bound(1));

        if (value1 == 0) {
            question.setText(questions.get("Question" + questionNo));
            answer11.setText(questions.get("Right" + questionNo));
            answer11.setTag("Correct");
            answer2.setText(questions.get("WrongA" + questionNo));
            answer3.setText(questions.get("WrongB" + questionNo));



        } else if (value1 == 1){
            question.setText(questions.get("Question" + questionNo));
            answer11.setText(questions.get("Right" + questionNo));
            answer2.setTag("Correct");
            answer3.setText(questions.get("WrongA" + questionNo));
            answer3.setText(questions.get("WrongB" + questionNo));

        } else if (value1 == 2) {
            question.setText(questions.get("Question" + questionNo));
            answer11.setText(questions.get("Right" + questionNo));
            answer3.setTag("Correct");
            answer2.setText(questions.get("WrongA" + questionNo));
            answer2.setText(questions.get("WrongB" + questionNo));

        }
    }


    private int bound(int i) {
        return i;
    }

    public void onAnswer11Click(View v) {
        if (v.getTag() == "Correct") {
            outcome.setText("Well Done!");
            questionNo++;
            setQuestion();
        } else {
            outcome.setText("Sorry, wrong answer!");
        }

    }

    public void onAnswer2Click(View v) {
        if (v.getTag() == "Correct") {
            outcome.setText("Well Done!");
            questionNo++;
            setQuestion();
        } else {
            outcome.setText("Sorry, wrong answer!");
        }

    }

    public void onAnswer3Click(View v) {
        if (v.getTag() == "Correct") {
            outcome.setText("Well Done!");
            questionNo++;
            setQuestion();
        } else {
            outcome.setText("Sorry, wrong answer!");
        }

    }

}