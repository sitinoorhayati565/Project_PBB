package com.example.edusmart

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_home -> {
                    true
                }

                R.id.nav_courses -> {
                    startActivity(
                        Intent(this, CoursesActivity::class.java)
                    )
                    true
                }

                R.id.nav_quiz -> {
                    true
                }

                R.id.nav_profile -> {
                    true
                }

                else -> false
            }
        }
    }
}