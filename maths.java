package com.example.android.quiz;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amro Abdelfatah on 05/02/2018.
 */

public class maths extends Activity {

    int result = 0;

    //extending the second activity called chemistry
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths);
    }

    //defining a toast message when the show answer button of the first question is clicked
    public void showMathsOne(View view) {
        Context context = getApplicationContext();
        CharSequence text = "e^x";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the second question is clicked
    public void showMathsTwo(View view) {
        Context context = getApplicationContext();
        CharSequence text = "4πR^2";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the third question is clicked
    public void showMathsThree(View view) {
        Context context = getApplicationContext();
        CharSequence text = "y = 2, x = 1";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //checking which radio button is clicked in the first question
    public void firstQuestionMaths(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ex_radio_button:
                result += 1;
                break;
        }
    }

    //checking which radio button is clicked in the second question
    public void secondQuestionMaths(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.fourPiR2_radio_button:
                result += 1;
                break;
        }
    }

    //checking which radio button is clicked in the third question


    //calculating and displaying the final quiz result
    public void showMathsResults(View v) {
        //checking the answer to the third question
        EditText editTextInputForX = (EditText) findViewById(R.id.x_value);
        String xValue = editTextInputForX.getText().toString();

        EditText editTextInputForY = (EditText) findViewById(R.id.y_value);
        String yValue = editTextInputForY.getText().toString();


        if (xValue.equals("1") && yValue.equals("2")) {
            result += 1;
        }

        TextView scoreView = (TextView) findViewById(R.id.maths_result);
        if (result == 3) {
            scoreView.setText(String.valueOf(result) + "/3" + "\nGenius!");
        } else {
            scoreView.setText(String.valueOf(result) + "/3" + "\nTry Again!");
        }
        result = 0;
    }

}
