package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity_home extends AppCompatActivity {
    Button aboutcomputer, hardwaresoftware, fullforms, flashdrive, data, computerparts, shortnotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        aboutcomputer = findViewById(R.id.aboutcomputer);
        hardwaresoftware = findViewById(R.id.hardwaresoftware);
        fullforms = findViewById(R.id.fullform);
        flashdrive = findViewById(R.id.flashdrive);
        data = findViewById(R.id.data);
        computerparts = findViewById(R.id.computerparts);
        shortnotes = findViewById(R.id.shortnotes);

        aboutcomputer.setOnClickListener(view -> startActivityForTopic("aboutcomputer"));

        hardwaresoftware.setOnClickListener(view -> startActivityForTopic("hardwaresoftware"));

        fullforms.setOnClickListener(view -> startActivityForTopic("fullforms"));

        flashdrive.setOnClickListener(view -> startActivityForTopic("flashdrive"));

        data.setOnClickListener(view -> startActivityForTopic("data"));

        computerparts.setOnClickListener(view -> startActivityForTopic("computerparts"));

        shortnotes.setOnClickListener(view -> startActivityForTopic("shortnotes"));
    }

    private void startActivityForTopic(String topic) {
        Intent intent = new Intent(activity_home.this, AllScreen.class);
        intent.putExtra("topic", topic);
        startActivity(intent);
    }
}