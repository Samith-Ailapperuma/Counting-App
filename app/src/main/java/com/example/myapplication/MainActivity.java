package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button count = findViewById(R.id.btn_count);
        Button toast = findViewById(R.id.btn_toast);
        TextView score = findViewById(R.id.tv_score);
        Button reset = findViewById(R.id.btn_reset);

        toast.setOnClickListener(v -> {
            CharSequence text = "The score is " + score.getText() + "!";
            Toast toast_message = Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT);
            toast_message.show();
        });

        count.setOnClickListener(v -> {
            int score_count = Integer.parseInt(score.getText().toString());
            score_count += 1;
            score.setText(String.valueOf(score_count));
        });

        reset.setOnClickListener(v -> {
            int score_count = 0;
            score.setText(String.valueOf(score_count));
        });
    }
}