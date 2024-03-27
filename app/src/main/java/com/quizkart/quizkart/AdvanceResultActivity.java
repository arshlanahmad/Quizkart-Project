package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;


public class AdvanceResultActivity extends AppCompatActivity {
    Button mRetryButton ,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_result);
        mRetryButton= (Button)findViewById(R.id.retry);
        home= (Button)findViewById(R.id.home);

        mRetryButton.setOnClickListener(view -> {
            startActivity(new Intent(AdvanceResultActivity.this,AdvanceQuiz.class));
            AdvanceResultActivity.this.finish();


        });
        home.setOnClickListener(view -> {
            startActivity(new Intent(AdvanceResultActivity.this,activity_learn_quiz.class));
            AdvanceResultActivity.this.finish();


        });
//

    }
}