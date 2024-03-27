package com.quizkart.quizkart;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntermediateQuiz extends AppCompatActivity {
    private final IntermediateQuestionLibrary mIntermediateQuestionLibrary = new IntermediateQuestionLibrary();
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
        setContentView(R.layout.activity_intermediate_quiz);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
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
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(IntermediateQuiz.this,IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else{
                    mrw.setText("Correct Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
            }
//                if the answer is wrong
            else {
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(IntermediateQuiz.this, IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else {
                    mrw.setText("Wrong Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Worng Answer ", Toast.LENGTH_SHORT).show();

                }

            }

        });
        mButtonChoice2.setOnClickListener(view -> {
            if (mButtonChoice2.getText() == mAnswer) {
                mScore= mScore+1;
                updateScore(mScore);
                //     Perform This check Before you update the question
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(IntermediateQuiz.this,IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else{
                    mrw.setText("Correct Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }

            }
//                if the answer is wrong
            else {
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(IntermediateQuiz.this, IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else {
                    mrw.setText("Wrong Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Worng Answer ", Toast.LENGTH_SHORT).show();

                }

            }

        });

        mButtonChoice3.setOnClickListener(view -> {
            if (mButtonChoice3.getText() == mAnswer) {
                mScore = mScore+1;
                updateScore(mScore);
                //     Perform This check Before you update the question
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length){
                    Intent i = new Intent(IntermediateQuiz.this,IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore",mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else{
                    mrw.setText("Correct Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }

            }

//                if the answer is wrong
            else {
                if (mQuestionnumber == IntermediateQuestionLibrary.mQuestion.length) {
                    Intent i = new Intent(IntermediateQuiz.this, IntermediateResultActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("FinalScore", mScore);
                    IntermediateQuiz.this.finish();
                    startActivity(i);
                }else {
                    mrw.setText("Wrong Answer");
                    updateQuestion();
//                        Toast.makeText(IntermediateQuiz.this, "Wong Answer", Toast.LENGTH_SHORT).show();

                }

            }



        });


    }

    public void updateQuestion(){
        mQuestionView.setText(mIntermediateQuestionLibrary.getQuestion(mQuestionnumber));
        mButtonChoice1.setText(mIntermediateQuestionLibrary.getChoice1(mQuestionnumber));
        mButtonChoice2.setText(mIntermediateQuestionLibrary.getChoice2(mQuestionnumber));
        mButtonChoice3.setText(mIntermediateQuestionLibrary.getChoice3(mQuestionnumber));
        mAnswer= mIntermediateQuestionLibrary.getCorrectAnswer(mQuestionnumber);


    }
    public void updateScore(int point){
        mScoreView.setText(""+mScore);
        mQuestionnumber++;


    }





}
