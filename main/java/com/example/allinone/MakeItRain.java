package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MakeItRain extends AppCompatActivity {

    private TextView textYouHave;
    private TextView textMoney;
    private Button buttonRain;
    private Button buttonMenu;

    private int  currentInstance  = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_it_rain);

        textYouHave = findViewById(R.id.text_youhave);
        textMoney  = findViewById(R.id.text_money);
        buttonRain = findViewById(R.id.button_rain);
        buttonMenu = findViewById(R.id.button_Menu2); // go bact to main activity





    }

    public void rainTapped(View view) {

        NumberFormat numberFormat  = NumberFormat.getCurrencyInstance();
        currentInstance +=1000;
        textMoney.setText(String.valueOf(numberFormat.format(currentInstance)));

        switch (currentInstance){
            case 10000:
                textMoney.setTextColor(Color.RED);
                break;
            case 20000:
                textMoney.setTextColor(Color.GREEN);
                break;
                default:{

                }
                break;
        }

    }

    public void mainTapped(View view) {

        Intent intent = getIntent();
        setResult(RESULT_OK,intent);
        finish();

    }
}
