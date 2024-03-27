package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class activity_learn_quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_learn_quiz);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        Button button = (Button) findViewById(R.id.learn);
        button.setOnClickListener(v -> opendatabase());
        button = (Button) findViewById(R.id.quiz);
        button.setOnClickListener(v -> openquizpage());


    }

    public void opendatabase() {
        Intent intent = new Intent(this, activity_home.class);
        startActivity(intent);
    }

    public void openquizpage() {
        Intent intent = new Intent(this, quizpage.class);
        startActivity(intent);
    }
}