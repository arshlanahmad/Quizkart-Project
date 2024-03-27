package com.quizkart.quizkart;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class quizpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_quizpage);
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Button button = (Button) findViewById(R.id.beginner);
        button.setOnClickListener(v -> openbeginnerquiz());
        button = (Button) findViewById(R.id.intermediate);
        button.setOnClickListener(v -> openintermediatequiz());
        button = (Button) findViewById(R.id.advance);
        button.setOnClickListener(v -> openadvancequiz());


    }

    public void openbeginnerquiz() {
        Intent intent = new Intent(this, BeginnerQuiz.class);
        startActivity(intent);
    }

    //
    public void openintermediatequiz() {
        Intent intent = new Intent(this, IntermediateQuiz.class);
        startActivity(intent);
    }


    public void openadvancequiz() {
        Intent intent = new Intent(this, AdvanceQuiz.class);
        startActivity(intent);
    }
}