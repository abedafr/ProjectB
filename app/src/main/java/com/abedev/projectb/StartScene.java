package com.abedev.projectb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class StartScene extends AppCompatActivity {

    private Button startGame;
    private ImageView gameName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_scene);
        initView();
    }

    private void initView() {
        initGUI();
        initAction();
    }

    private void initGUI() {
        gameName = (ImageView) findViewById(R.id.gameName);
        startGame = (Button) findViewById(R.id.startButton);
    }

    private void initAction() {
        gameName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(StartScene.this, About.class);
                startActivity(intent);
                return false;
            }
        });
    }

    public void start(View view) {
//        startGame.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
                Intent forwardIntent = new Intent(this, Home.class);
                startActivity(forwardIntent);
//            }
//        });
    }
}
