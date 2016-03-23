package com.example.jacksw.mygrade;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.GradeDisplay;

public class MainActivity extends AppCompatActivity implements GradeDisplay {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        Integer score = getScore();
        String grade = convertScoreToGrade(score);
        setScore(grade);
    }

    @NonNull
    public Integer getScore() {
        EditText scoreInput = (EditText)findViewById(R.id.scoreInput);
        return Integer.parseInt(scoreInput.getText().toString());
    }

    @NonNull
    private String convertScoreToGrade(Integer score) {
        String grade = "F";
        if(score >= 90){
            grade = "A";
        }
        return grade;
    }

    private void setScore(String grade) {
        TextView gradeText = (TextView)findViewById(R.id.gradeView);
        gradeText.setText(grade);

        gradeText.setVisibility(View.VISIBLE);
        TextView gradeCaption = (TextView)findViewById(R.id.gradeCaption);
        gradeCaption.setVisibility(View.VISIBLE);
    }


}
