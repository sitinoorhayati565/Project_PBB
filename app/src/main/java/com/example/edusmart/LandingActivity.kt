package com.example.edusmart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_landing)

        findViewById<Button>(R.id.btnStart)
            .setOnClickListener {

                startActivity(
                    Intent(
                        this,
                        SignInActivity::class.java
                    )
                )

            }
    }
}