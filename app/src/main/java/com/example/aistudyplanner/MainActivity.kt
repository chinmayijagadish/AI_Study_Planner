package com.example.aistudyplanner

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get UI elements
        val subjectInput = findViewById<EditText>(R.id.etSubject)
        val hoursInput = findViewById<EditText>(R.id.etHours)
        val generateButton = findViewById<Button>(R.id.btnGenerate)

        // Button click action
        generateButton.setOnClickListener {
            val subject = subjectInput.text.toString()
            val hours = hoursInput.text.toString()

            if (subject.isEmpty() || hours.isEmpty()) {
                Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Generating study plan for $subject ($hours hrs/day)",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}