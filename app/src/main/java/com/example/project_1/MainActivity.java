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
        Intent newScreen = new Intent(this,shopplace.class);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        String msg = "Your name is " + editText1.getText().toString() +
                " and Your PassWord Is " + editText2.getText().toString() + "\n" + "YOU CAN ENTER";
        newScreen.putExtra(MSG,msg);
        startActivity(newScreen);
    }
}