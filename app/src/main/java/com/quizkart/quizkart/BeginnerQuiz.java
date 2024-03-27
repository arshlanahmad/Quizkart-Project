package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;


public class BeginnerQuiz extends AppCompatActivity {
    private final BeginnerQuestionLibrary mBeginnerQuestionLibrary = new BeginnerQuestionLibrary();
    private TextView mScoreView;
    private  TextView mQuestionView;
    private Button mButtonChoice1;
    private TextView mrw;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private int mScore = 0;
    private  int mQuestionnumber =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_beginner_quiz);
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mScoreView = (TextView) findViewById(R.id.Score);
        mrw= (TextView) findViewById(R.id.mrw);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        mButtonChoice1.setOnClickListener(view -> {
            if (mButtonChoice1.getText() == mAnswer) {
                mScore= mScore+1;
                updateScore(mScore);
//                 Perform This check Before you update the question
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(BeginnerQuiz.this,BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else{

                    updateQuestion();
                    mrw.setText("Correct Answer");

                }
            }
//                if the answer is wrong
            else {
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(BeginnerQuiz.this, BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else {

                    updateQuestion();
                    mrw.setText("Wrong Answer");

                }

            }

        });
        mButtonChoice2.setOnClickListener(view -> {
            if (mButtonChoice2.getText() == mAnswer) {
                mScore= mScore+1;
                updateScore(mScore);
                //     Perform This check Before you update the question
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(BeginnerQuiz.this,BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else{
                    mrw.setText("Correct Answer");
                    updateQuestion();

                }

            }
//                if the answer is wrong
            else {
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(BeginnerQuiz.this, BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else {
                    mrw.setText("Wrong Answer");
                    updateQuestion();


                }

            }

        });

        mButtonChoice3.setOnClickListener(view -> {
            if (mButtonChoice3.getText() == mAnswer) {
                mScore = mScore+1;
                updateScore(mScore);
                //     Perform This check Before you update the question
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(BeginnerQuiz.this,BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else{
                    mrw.setText("Correct Answer");
                    updateQuestion();

                }

            }

//                if the answer is wrong
            else {
                if (mQuestionnumber == BeginnerQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(BeginnerQuiz.this, BeginnerResult.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    BeginnerQuiz.this.finish();
                    startActivity(i);
                }else {
                    mrw.setText("Wrong Answer");
                    updateQuestion();


                }

            }



        });


    }

    public void updateQuestion(){
        mQuestionView.setText(mBeginnerQuestionLibrary.getQuestion(mQuestionnumber));
        mButtonChoice1.setText(mBeginnerQuestionLibrary.getChoice1(mQuestionnumber));
        mButtonChoice2.setText(mBeginnerQuestionLibrary.getChoice2(mQuestionnumber));
        mButtonChoice3.setText(mBeginnerQuestionLibrary.getChoice3(mQuestionnumber));
        mAnswer= mBeginnerQuestionLibrary.getCorrectAnswer(mQuestionnumber);


    }
    public void updateScore(int point){
        mScoreView.setText(""+mScore);
        mQuestionnumber++;


    }



}