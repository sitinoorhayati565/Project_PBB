package com.example.edusmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView txtScore, txtStars;
    Button btnBackCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtScore = findViewById(R.id.txtScore);
        txtStars = findViewById(R.id.txtStars);
        btnBackCourse = findViewById(R.id.btnBackCourse);

        int score = getIntent().getIntExtra("score", 0);

        txtScore.setText(String.valueOf(score));

        if (score >= 80) {
            txtStars.setText("⭐⭐⭐⭐⭐");
        } else if (score >= 60) {
            txtStars.setText("⭐⭐⭐⭐");
        } else if (score >= 40) {
            txtStars.setText("⭐⭐⭐");
        } else {
            txtStars.setText("⭐⭐");
        }

        btnBackCourse.setOnClickListener(v -> {

            Intent intent = new Intent(
                    ResultActivity.this,
                    CourseDetailActivity.class);

            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}