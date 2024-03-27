package com.quizkart.quizkart;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AllScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_screen);

        // Retrieve the topic from intent extras
        String topic = getIntent().getStringExtra("topic");

        // Load the XML layout based on the topic type
        assert topic != null;
        int layoutId = getLayoutIdForTopic(topic);
        if (layoutId != 0) {
            setContentView(layoutId);
        } else {
            Toast.makeText(this, "Topic Not Fount", Toast.LENGTH_SHORT).show();
        }
    }

    private int getLayoutIdForTopic(String topic) {
        // Map topic types to corresponding layout resource IDs
        switch (topic) {
            case "aboutcomputer":
                return R.layout.aboutcomputer;
            case "hardwaresoftware":
                return R.layout.hardwaresoftware;
            case "fullforms":
                return R.layout.fullforms;
            case "flashdrive":
                return R.layout.flashdrive;
            case "data":
                return R.layout.data;
            case "computerparts":
                return R.layout.computerparts;
            case "shortnotes":
                return R.layout.shortnotes;
            default:
                // Return 0 if no layout is found for the topic
                return 0;
        }
    }
}
