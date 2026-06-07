package com.example.edusmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);

        Button btnQuiz = findViewById(R.id.btnQuiz);

        btnQuiz.setOnClickListener(v -> {

            Intent intent = new Intent(
                    Lesson4Activity.this,
                    QuizActivity.class);

            startActivity(intent);
        });
    }
}