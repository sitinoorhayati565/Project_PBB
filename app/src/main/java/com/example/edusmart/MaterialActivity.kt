package com.example.edusmart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MaterialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_material)

        findViewById<Button>(R.id.btnNextQuiz)
            .setOnClickListener {

                startActivity(
                    Intent(this, QuizActivity::class.java)
                )
            }
    }
}