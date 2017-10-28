package com.abedev.projectb;

import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private TextView twitter;
    private TextView github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initGUI();
    }

    private void initGUI() {
        twitter= (TextView) findViewById(R.id.my_twitter);
        github= (TextView) findViewById(R.id.my_github);
        twitter.setMovementMethod(LinkMovementMethod.getInstance());
        github.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
