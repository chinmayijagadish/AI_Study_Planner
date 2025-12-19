package com.example.aistudyplanner

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // IMPORTANT: this must be activity_result, NOT activity_main
        setContentView(R.layout.activity_result)

        val tvCourse = findViewById<TextView>(R.id.tvCourse)
        val tvSubject = findViewById<TextView>(R.id.tvSubject)
        val tvHours = findViewById<TextView>(R.id.tvHours)

        val course = intent.getStringExtra("COURSE")
        val subject = intent.getStringExtra("SUBJECT")
        val hours = intent.getIntExtra("HOURS", 1)

        tvCourse.text = "Course: $course"
        tvSubject.text = "Subject: $subject"
        tvHours.text = "Hours per day: $hours"
    }
}
