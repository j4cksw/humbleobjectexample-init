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
        TextView scoreText = (TextView)findViewById(R.id.gradeView);

        String grade = "B";
        scoreText.setText(grade);
    }

}
