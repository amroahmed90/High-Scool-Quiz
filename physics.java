package com.example.android.quiz;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amro Abdelfatah on 05/02/2018.
 */

public class physics extends Activity {

    int result = 0;

    //extending the second activity called physics
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics);
    }

    //defining a toast message when the show answer button of the first question is clicked
    public void showPhysicsOne(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Ohm";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the second question is clicked
    public void showPhysicsTwo(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Positive";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the third question is clicked
    public void showPhysicsThree(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Pressure";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //checking which radio button is clicked in the first question
    public void firstQuestionPhysics(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ohm_radio_button:
                result += 1;
                break;
        }
    }

    //checking which radio button is clicked in the second question
    public void secondQuestionPhysics(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.positive_radio_button:
                result += 1;
                break;
        }
    }

    //checking which radio button is clicked in the third question
    public void thirdQuestionPhysics(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.pressure_radio_button:
                result += 1;
                break;
        }
    }

    //calculating and displaying the final quiz result
    public void showPhysicsResults(View v) {
        TextView scoreView = (TextView) findViewById(R.id.physics_result);
        if (result == 3) {
            scoreView.setText(String.valueOf(result) + "/3" + "\nGenius!");
        } else {
            scoreView.setText(String.valueOf(result) + "/3" + "\nTry Again!");
        }
        result = 0;
    }
}
