package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shopplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String s = intent.getStringExtra(MainActivity.MSG);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopplace);
        TextView textView = findViewById(R.id.textView1);
        textView.setText(s);
    }

    public void HOME(View view){
        Intent newScreen = new Intent(this, MainActivity.class);
        startActivity(newScreen);
    }
}