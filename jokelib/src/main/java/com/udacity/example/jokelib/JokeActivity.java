package com.udacity.example.jokelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if(getIntent().getExtras().getString("joke") != null) {
            TextView textView = (TextView) findViewById(R.id.joke);
            textView.setText(getIntent().getExtras().getString("joke"));
        }
    }
}
