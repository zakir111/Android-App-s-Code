package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShowNameNow extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;
    private Button buttonMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name_now);

        editText  = findViewById(R.id.edit1);
        button = findViewById(R.id.button_show);
        textView  = findViewById(R.id.text_result);
        buttonMenu = findViewById(R.id.button_menu);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name  =  editText.getText().toString();
                textView.setText("Hello " + name);
            }
        });


        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  getIntent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }


}
