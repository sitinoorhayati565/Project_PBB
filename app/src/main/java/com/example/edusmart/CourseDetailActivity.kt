package com.example.edusmart

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CourseDetailActivity : AppCompatActivity() {

    private lateinit var cardMateri1: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        cardMateri1 = findViewById(R.id.cardMateri1)

        cardMateri1.setOnClickListener {
            val intent = Intent(
                this@CourseDetailActivity,
                LessonActivity::class.java
            )
            startActivity(intent)
        }
    }
}