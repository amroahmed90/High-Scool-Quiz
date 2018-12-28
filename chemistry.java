package com.example.android.quiz;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amro Abdelfatah on 05/02/2018.
 */

public class chemistry extends Activity {

    int result = 0;

    //extending the second activity called chemistry
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemistry);
    }

    //defining a toast message when the show answer button of the first question is clicked
    public void showChemistryOne(View view) {
        Context context = getApplicationContext();
        CharSequence text = "C2H6";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the second question is clicked
    public void showChemistryTwo(View view) {
        Context context = getApplicationContext();
        CharSequence text = "7 < pH < 14";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //defining a toast message when the show answer button of the third question is clicked
    public void showChemistryThree(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hydrogen Bonds";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //checking which radio button is clicked in the second question
    public void secondQuestionChemistry(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.more_radio_button:
                result += 1;
                break;
        }
    }

    //checking which radio button is clicked in the third question
    public void thirdQuestionChemistry(View v) {
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.hydogen_radio_button:
                result += 1;
                break;
        }
    }

    //calculating and displaying the final quiz result
    public void showChemistryResults(View v) {
        //checking the right answer of question one
        CheckBox c2h6CheckBox = (CheckBox) findViewById(R.id.c2h6_check_box);
        boolean c2h6 = c2h6CheckBox.isChecked();

        CheckBox ch3ch3CheckBox = (CheckBox) findViewById(R.id.ch3ch3_check_box);
        boolean ch3ch3 = ch3ch3CheckBox.isChecked();

        if (c2h6 && ch3ch3) {
            result += 1;
        }


        TextView scoreView = (TextView) findViewById(R.id.chemistry_result);
        if (result == 3) {
            scoreView.setText(String.valueOf(result) + "/3" + "\nGenius!");
        } else {
            scoreView.setText(String.valueOf(result) + "/3" + "\nTry Again!");
        }
        result = 0;
    }

}
