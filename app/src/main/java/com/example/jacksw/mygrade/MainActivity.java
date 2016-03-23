package com.example.jacksw.mygrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        TextView gradeText = (TextView)findViewById(R.id.gradeView);

        String grade = "B";
        gradeText.setText(grade);

        gradeText.setVisibility(View.VISIBLE);

        TextView gradeCaption = (TextView)findViewById(R.id.gradeCaption);
        gradeCaption.setVisibility(View.VISIBLE);
    }


}
