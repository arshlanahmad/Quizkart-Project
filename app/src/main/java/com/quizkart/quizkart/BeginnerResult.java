package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import androidx.annotation.RequiresApi;

import android.content.Intent;
import android.widget.Button;


public class BeginnerResult extends AppCompatActivity {
    Button mRetryButton , mhome;

    //    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_beginner_result);
        mRetryButton= (Button)findViewById(R.id.retry);
        mhome= (Button)findViewById(R.id.home);
        //        Bundle bundle = getIntent().getExtras();
        //        int score = bundle.getInt("FinalScore");

        //        mFinalScore.setText("You Scored "  +  score  +  "out of "+BeginnerQuestionLibrary.mQuestion.length );
        //
        //
        //        if (score==24){
        //            mGrade.setText("amazing");
        //        }else if (score==23){
        //            mGrade.setText("Good Work");
        //        }else{
        //            mGrade.setText("go back to learn");
        //        }



        mRetryButton.setOnClickListener(view -> {
            startActivity(new  Intent(BeginnerResult.this,BeginnerQuiz.class));
            BeginnerResult.this.finish();


        });

        mhome.setOnClickListener(view -> {
            startActivity(new  Intent(BeginnerResult.this,IntermediateQuiz.class));
            BeginnerResult.this.finish();

        });

    }
}