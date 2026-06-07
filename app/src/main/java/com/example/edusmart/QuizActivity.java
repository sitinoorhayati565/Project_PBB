package com.example.edusmart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    TextView txtQuestion, txtQuestionNumber;
    ProgressBar progressQuiz;
    RadioGroup radioGroup;
    Button btnNext;

    String[] questions = {
            "What is the pronoun in this sentence? 'She likes English.'",
            "Which word is a noun?",
            "Choose the verb:",
            "Simple Present Tense is used for?",
            "Which is a pronoun?"
    };

    String[][] options = {
            {"Likes", "English", "She", "Is"},
            {"Run", "Book", "Beautiful", "Quickly"},
            {"Teacher", "Study", "Blue", "Table"},
            {"Past events", "Future plans", "Habits", "Dreams"},
            {"School", "Car", "They", "Table"}
    };

    int[] answers = {2, 1, 1, 2, 2};

    int currentQuestion = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        txtQuestion = findViewById(R.id.txtQuestion);
        txtQuestionNumber = findViewById(R.id.txtQuestionNumber);
        progressQuiz = findViewById(R.id.progressQuiz);
        radioGroup = findViewById(R.id.radioGroup);
        btnNext = findViewById(R.id.btnNext);

        loadQuestion();

        btnNext.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId != -1) {

                int selectedIndex = radioGroup.indexOfChild(
                        findViewById(selectedId));

                if (selectedIndex == answers[currentQuestion]) {
                    score += 20;
                }

                currentQuestion++;

                if (currentQuestion < questions.length) {

                    loadQuestion();

                } else {

                    Intent intent = new Intent(
                            QuizActivity.this,
                            ResultActivity.class);

                    intent.putExtra("score", score);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void loadQuestion() {

        txtQuestionNumber.setText(
                "Soal " + (currentQuestion + 1) + "/5");

        progressQuiz.setProgress(currentQuestion + 1);

        txtQuestion.setText(
                questions[currentQuestion]);

        radioGroup.clearCheck();

        ((android.widget.RadioButton)
                radioGroup.getChildAt(0))
                .setText(options[currentQuestion][0]);

        ((android.widget.RadioButton)
                radioGroup.getChildAt(1))
                .setText(options[currentQuestion][1]);

        ((android.widget.RadioButton)
                radioGroup.getChildAt(2))
                .setText(options[currentQuestion][2]);

        ((android.widget.RadioButton)
                radioGroup.getChildAt(3))
                .setText(options[currentQuestion][3]);
    }
}