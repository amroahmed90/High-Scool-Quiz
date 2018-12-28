package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //creating a method to control what happens when the Button physics is clicked
    public void openPhysicsQuiz(View v) {
        Intent i = new Intent(MainActivity.this, physics.class);
        startActivity(i);
    }

    //creating a method to control what happens when the Button chemistry is clicked
    public void openChemistryQuiz(View v) {
        Intent i = new Intent(MainActivity.this, chemistry.class);
        startActivity(i);
    }

    //creating a method to control what happens when the Button maths is clicked
    public void openMathsQuiz(View v) {
        Intent i = new Intent(MainActivity.this, maths.class);
        startActivity(i);
    }
}
