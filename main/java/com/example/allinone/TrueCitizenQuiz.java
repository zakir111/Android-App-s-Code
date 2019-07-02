package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TrueCitizenQuiz extends AppCompatActivity implements View.OnClickListener {
    private Button buttonMenu4;
    private TextView textQuestion;
    private Button buttonTrue;
    private Button buttonFalse;
    private ImageButton buttonPrev;
    private ImageButton buttonNext;
    private int currentIndex = 0;

    Question[] questionsBank = new Question[]{
            new Question(R.string.sample_question,true),
            new Question(R.string.question_declaration,false),
            new Question(R.string.ques,true)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_citizen_quiz);

        textQuestion = findViewById(R.id.text_question);
        buttonTrue = findViewById(R.id.button_true);
        buttonFalse = findViewById(R.id.button_false);
        buttonPrev = findViewById(R.id.button_prev);
        buttonNext = findViewById(R.id.button_next);

        buttonMenu4 = findViewById(R.id.button_Menu4);


        buttonTrue.setOnClickListener(this);
        buttonFalse.setOnClickListener(this);
        buttonPrev.setOnClickListener(this);
        buttonNext.setOnClickListener(this);

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =  getIntent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_next:
                currentIndex = (currentIndex +1) % questionsBank.length;
               textQuestion.setText(questionsBank[currentIndex].getAnsID());
               break;
            case R.id.button_prev:
                if (currentIndex >0){
                    currentIndex = (currentIndex - 1) % questionsBank.length;
                    textQuestion.setText(questionsBank[currentIndex].getAnsID());
                   }
                break;
            case R.id.button_true:
                checkAnswer(true);
                break;
            case R.id.button_false:
                    checkAnswer(false);
                break;


        }
    }

    public void checkAnswer(boolean userChooseCorrect){

        boolean answerIsTrue  = questionsBank[currentIndex].isAnswerCorrect();

        if (answerIsTrue == userChooseCorrect){

            Toast.makeText(TrueCitizenQuiz.this,"That is Correct",
                    Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(TrueCitizenQuiz.this,"That is InCorrect",
                    Toast.LENGTH_SHORT).show();
        }

    }

}
