package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shopplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopplace);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.myOrder);
        textView.setText(message);

    }

    public void HOME(View view){
        Intent newScreen = new Intent(this, MainActivity.class);
        startActivity(newScreen);
    }
}