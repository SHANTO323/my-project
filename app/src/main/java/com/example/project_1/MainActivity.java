package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next_page(View view){
        EditText text1 = findViewById(R.id.editText1);
        EditText text2 = findViewById(R.id.editText2);
        String msg = "Your name is " + text1 + " and Your PassWord Is " + text2 + "\n" + "YOU CAN ENTER";
        Intent newScreen = new Intent(this,shopplace.class);
        newScreen.putExtra(MSG,msg);
        startActivity(newScreen);
    }
}