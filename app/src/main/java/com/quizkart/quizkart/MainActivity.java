package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        Button button = (Button) findViewById(R.id.data);
        button.setOnClickListener(v -> opendatabase());

  }
  public void  opendatabase() {
   Intent intent = new Intent(this,activity_learn_quiz.class);
       startActivity(intent);
  }
    }
