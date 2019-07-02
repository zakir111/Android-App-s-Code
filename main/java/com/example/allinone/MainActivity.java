package com.example.allinone;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonShow;
    private Button buttonRain;
    private Button buttonQuiz;
    private final int REQUEST_CODE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShow  = findViewById(R.id.button_show);
        buttonRain  = findViewById(R.id.button_rain);
        buttonQuiz = findViewById(R.id.button_quiz);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this,ShowNameNow.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

        buttonRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MakeItRain.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TrueCitizenQuiz.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){
            Toast.makeText(MainActivity.this,"In Main Menu",Toast.LENGTH_SHORT).show();

        }

    }
}
