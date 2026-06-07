package com.example.edusmart

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class CoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val grammar = findViewById<LinearLayout>(R.id.cardGrammar)
        val vocabulary = findViewById<LinearLayout>(R.id.cardVocabulary)
        val speaking = findViewById<LinearLayout>(R.id.cardSpeaking)
        val listening = findViewById<LinearLayout>(R.id.cardListening)

        grammar.setOnClickListener {

            // Nanti menuju halaman materi grammar
            // startActivity(
            //     Intent(this, GrammarMaterialActivity::class.java)
            // )

        }
    }
}