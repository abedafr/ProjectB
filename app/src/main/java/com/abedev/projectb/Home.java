package com.abedev.projectb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Home extends AppCompatActivity {

    private Button check;
    private Button restart;
    private Button back;

    private TextView result;
    private TextView history;
    private EditText answer;
    private Integer randNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        randNumber = generateRandomNumber();
    }

    private void initView() {
        initGUI();
        initAction();
    }

    private void initGUI() {
        result = (TextView) findViewById(R.id.result);
        history = (TextView) findViewById(R.id.history);
        answer = (EditText) findViewById(R.id.answer);

        check = (Button) findViewById(R.id.check);
        restart = (Button) findViewById(R.id.restart);
        back = (Button) findViewById(R.id.back);
    }

    private void initAction() {
        doOnCheck();
        doOnRestart();
    }

    private void doOnCheck() {
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer.length() != 0) {
                    int number = Integer.valueOf(answer.getText().toString());
                    answer.setText("");
                    if (number > randNumber) {
                        result.setText("YOU ARE ABOVE!!");
                    } else if (number < randNumber) {
                        result.setText("YOU ARE BELOW!!");
                    } else {
                        result.setText("CORRECT!!");

                    }
                    if (history.length() != 0) {
                        history.append(" - ");
                    }
                    history.append(number + "");
                } else {
                    Toast.makeText(Home.this, "YOU HAVE TO ENTER A NUMBER", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void doOnRestart() {
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                history.setText("");
                result.setText("LET'S PLAY AGAIN!");
                randNumber=generateRandomNumber();
            }
        });

    }

    public void doOnBack(View view) {
        Intent backwardIntent = new Intent(this, StartScene.class);
        startActivity(backwardIntent);
    }


    public Integer generateRandomNumber() {
        Integer number;
        Random random = new Random();
        number = random.nextInt(100) + 1;
        return number;
    }
}
