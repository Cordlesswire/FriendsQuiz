package com.example.anandparmeetsingh.friendsquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.anandparmeetsingh.friendsquiz.R.id.que1R;
import static com.example.anandparmeetsingh.friendsquiz.R.id.que8R;

public class MainActivity extends AppCompatActivity {


    int totalScore = 0;
    int totalAnswered = 0;
    int answered[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int score[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int counter = 0;
    int a10 = 0;
    int b10 = 0;
    int size = score.length;
    int v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstQuestion(View view) {
        RadioGroup que1R = (RadioGroup) findViewById(R.id.que1R);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[0] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que1A:
                if (checked) {
                    score[0] = 1;
                    for (int i = 0; i < que1R.getChildCount(); i++) {
                        if (i == 0) {
                            continue;
                        }
                        que1R.getChildAt(i).setEnabled(false);
                    }
                }
                // Pirates are the best

                break;
            case R.id.que1B:
                if (checked) {
                    score[0] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que1C:
                if (checked) {
                    score[0] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que1D:
                if (checked) {
                    score[0] = 0;
                }
                // Ninjas rule
                break;
        }

    }

    public void secondQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[1] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que2A:
                if (checked) {
                    score[1] = 0;
                }
                // Pirates are the best

                break;
            case R.id.que2B:
                if (checked) {
                    score[1] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que2C:
                if (checked) {
                    score[1] = 1;
                    RadioGroup que2R = (RadioGroup) findViewById(R.id.que2R);
                    for (int i = 0; i < que2R.getChildCount(); i++) {
                        if (i == 2) {
                            continue;
                        }
                        que2R.getChildAt(i).setEnabled(false);
                    }
                }
                // Ninjas rule
                break;
            case R.id.que2D:
                if (checked) {
                    score[1] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void thirdQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[2] = 1;
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.que3A:
                if (checked) {
                    score[2] = 1;
                    RadioGroup que3R = (RadioGroup) findViewById(R.id.que3R);
                    for (int i = 0; i < que3R.getChildCount(); i++) {
                        if (i == 0) {
                            continue;
                        }
                        que3R.getChildAt(i).setEnabled(false);
                    }
                }
                // Pirates are the best
                break;
            case R.id.que3B:
                if (checked) {
                    score[2] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que3C:
                if (checked) {
                    score[2] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que3D:
                if (checked) {
                    score[2] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void fourthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[3] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que4A:
                if (checked) {
                    score[3] = 0;
                }
                // Pirates are the best
                break;
            case R.id.que4B:
                if (checked) {
                    score[3] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que4C:
                if (checked) {
                    score[3] = 1;
                    RadioGroup que4R = (RadioGroup) findViewById(R.id.que4R);
                    for (int i = 0; i < que4R.getChildCount(); i++) {
                        if (i == 2) {
                            continue;
                        }
                        que4R.getChildAt(i).setEnabled(false);
                    }
                }
                // Ninjas rule
                break;
            case R.id.que4D:
                if (checked) {
                    score[3] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void fifthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[4] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que5A:
                if (checked) {
                    score[4] = 1;
                    RadioGroup que5R = (RadioGroup) findViewById(R.id.que5R);
                    for (int i = 0; i < que5R.getChildCount(); i++) {
                        if (i == 0) {
                            continue;
                        }
                        que5R.getChildAt(i).setEnabled(false);
                    }
                }
                // Pirates are the best
                break;
            case R.id.que5B:
                if (checked) {
                    score[4] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que5C:
                if (checked) {
                    score[4] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que5D:
                if (checked) {
                    score[4] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void sixthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[5] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que6A:
                if (checked) {
                    score[5] = 1;
                    RadioGroup que6R = (RadioGroup) findViewById(R.id.que6R);
                    for (int i = 0; i < que6R.getChildCount(); i++) {
                        if (i == 0) {
                            continue;
                        }
                        que6R.getChildAt(i).setEnabled(false);
                    }
                }
                // Pirates are the best
                break;
            case R.id.que6B:
                if (checked) {
                    score[5] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que6C:
                if (checked) {
                    score[5] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que6D:
                if (checked) {
                    score[5] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void senventhQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[6] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que7A:
                if (checked) {
                    score[6] = 0;
                }
                // Pirates are the best
                break;
            case R.id.que7B:
                if (checked) {
                    score[6] = 1;
                    RadioGroup que7R = (RadioGroup) findViewById(R.id.que7R);
                    for (int i = 0; i < que7R.getChildCount(); i++) {
                        if (i == 1) {
                            continue;
                        }
                        que7R.getChildAt(i).setEnabled(false);
                    }
                }
                // Ninjas rule
                break;
            case R.id.que2C:
                if (checked) {
                    score[6] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que7D:
                if (checked) {
                    score[6] = 0;
                }
                // Ninjas rule
                break;
        }
    }

    public void eightthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) answered[7] = 1;
        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.que8A:
                if (checked) {
                    score[7] = 0;
                }
                // Pirates are the best
                break;
            case R.id.que8B:
                if (checked) {
                    score[7] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que8C:
                if (checked) {
                    score[7] = 0;
                }
                // Ninjas rule
                break;
            case R.id.que8D:
                if (checked) {
                    score[7] = 1;
                    RadioGroup que8R = (RadioGroup) findViewById(R.id.que8R);
                    for (int i = 0; i < que8R.getChildCount(); i++) {
                        if (i == 3) {
                            continue;
                        }
                        que8R.getChildAt(i).setEnabled(false);
                    }
                }
                // Ninjas rule
                break;
        }
    }

    public void ninth() {
        EditText ninth = (EditText) findViewById(R.id.que9ans);
        String ans = ninth.getText().toString();
        if (!TextUtils.isEmpty(ans)) {
            answered[8] = 1;
        }
        if (ans.equalsIgnoreCase("Mitten")) {
            score[8] = 1;
            ninth.setEnabled(false);
        } else {
            score[8] = 0;
        }
    }

    public void tenth(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            answered[9] = 1;
        }
        switch (view.getId()) {

            case R.id.que10A:
                if (checked) {
                    a10 = 2;

                }
                // Pirates are the best
                else {
                    break;
                }
            case R.id.que10B:
                if (checked) {
                    b10 = 2;

                }
                // Ninjas rule
                else {
                    break;
                }
            case R.id.que10C:
                if (checked) {
                    score[9] = 0;
                }
                // Ninjas rule
                else {
                    break;
                }
            case R.id.que10D:
                if (checked) {
                    score[9] = 0;
                }
                // Ninjas rule
                else {
                    break;
                }

        }
        if (a10 == 2 && b10 == 2) {
            score[9] = 1;

        }

    }


    public int calScore(int a[]) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            totalScore += a[i];
        }
        return totalScore;


    }

    public int calcAnsweredCount(int a[]) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            totalAnswered += a[i];
        }
        return totalAnswered;


    }



    public void calcResult(View view) {
        ninth();


        if (counter == 0) {

            calcAnsweredCount(answered);
            if (totalAnswered < 10) {
                Context context = getApplicationContext();
                CharSequence text = " You Forgot  to answer all questions ";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                totalScore = 0;
                totalAnswered = 0;
            } else if (totalAnswered == 10) {
                calScore(score);
                EditText name = (EditText) findViewById(R.id.name_hint);
                String ans = name.getText().toString();
                String scoreMessage = "Hello " + ans + " your score is " + totalScore + ". Enjoy the day.";
                Context context = getApplicationContext();
                CharSequence message = scoreMessage;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                totalAnswered = 0;

            } else {
                calScore(score);
                String message = "Something is wrong";
                Context context = getApplicationContext();
                CharSequence text1 = message;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
                totalAnswered = 0;
                totalScore = 0;
            }
        }
    }
    public void shareOrNot(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "I just took Friends Quiz and I scored " + totalScore + "/10.");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }

    public void reset(View view) {
        for (int i = 0; i < size; i++) {
            score[i] = 0;
            answered[i] = 0;
        }
        RadioGroup que1G = (RadioGroup) findViewById(que1R);
        que1G.clearCheck();
        RadioGroup que2G = (RadioGroup) findViewById(R.id.que2R);
        que2G.clearCheck();
        RadioGroup que3G = (RadioGroup) findViewById(R.id.que3R);
        que3G.clearCheck();
        RadioGroup que4G = (RadioGroup) findViewById(R.id.que4R);
        que4G.clearCheck();
        RadioGroup que5G = (RadioGroup) findViewById(R.id.que5R);
        que5G.clearCheck();
        RadioGroup que6G = (RadioGroup) findViewById(R.id.que6R);
        que6G.clearCheck();
        RadioGroup que7G = (RadioGroup) findViewById(R.id.que7R);
        que7G.clearCheck();
        RadioGroup que8G = (RadioGroup) findViewById(que8R);
        que8G.clearCheck();
        CheckBox que10A = (CheckBox) findViewById(R.id.que10A);
        que10A.setChecked(false);
        CheckBox que10B = (CheckBox) findViewById(R.id.que10B);
        que10B.setChecked(false);
        CheckBox que10C = (CheckBox) findViewById(R.id.que10C);
        que10C.setChecked(false);
        CheckBox que10D = (CheckBox) findViewById(R.id.que10D);
        que10D.setChecked(false);
        EditText que9 = (EditText) findViewById(R.id.que9ans);
        que9.getText().clear();
        RadioGroup que8R = (RadioGroup) findViewById(R.id.que8R);
        for (int i = 0; i < que8R.getChildCount(); i++) {
            if (i == 3) {
                continue;
            }
            que8R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que7R = (RadioGroup) findViewById(R.id.que7R);
        for (int i = 0; i < que7R.getChildCount(); i++) {
            if (i == 1) {
                continue;
            }
            que7R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que6R = (RadioGroup) findViewById(R.id.que6R);
        for (int i = 0; i < que6R.getChildCount(); i++) {
            if (i == 0) {
                continue;
            }
            que6R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que5R = (RadioGroup) findViewById(R.id.que5R);
        for (int i = 0; i < que5R.getChildCount(); i++) {
            if (i == 0) {
                continue;
            }
            que5R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que4R = (RadioGroup) findViewById(R.id.que4R);
        for (int i = 0; i < que4R.getChildCount(); i++) {
            if (i == 2) {
                continue;
            }
            que4R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que3R = (RadioGroup) findViewById(R.id.que3R);
        for (int i = 0; i < que3R.getChildCount(); i++) {
            if (i == 0) {
                continue;
            }
            que3R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que2R = (RadioGroup) findViewById(R.id.que2R);
        for (int i = 0; i < que2R.getChildCount(); i++) {
            if (i == 2) {
                continue;
            }
            que2R.getChildAt(i).setEnabled(true);
        }
        RadioGroup que1R = (RadioGroup) findViewById(R.id.que1R);
        for (int i = 0; i < que1R.getChildCount(); i++) {
            if (i == 0) {
                continue;
            }
            que1R.getChildAt(i).setEnabled(true);
            EditText ninth = (EditText) findViewById(R.id.que9ans);
            ninth.setEnabled(true);
        }
    }


}
