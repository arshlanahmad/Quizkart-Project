package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;


public class IntermediateResultActivity extends AppCompatActivity {
    Button mRetryButton , mhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_result);
        mRetryButton= (Button)findViewById(R.id.retry);
        mhome= (Button)findViewById(R.id.home);




        mRetryButton.setOnClickListener(view -> {
            startActivity(new Intent(IntermediateResultActivity.this,IntermediateQuiz.class));
            IntermediateResultActivity.this.finish();


        });

        mhome.setOnClickListener(view -> {
            startActivity(new Intent (IntermediateResultActivity.this,AdvanceQuiz.class));
            IntermediateResultActivity.this.finish();

        });

    }
}


