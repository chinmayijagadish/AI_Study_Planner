package com.example.aistudyplanner

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spCourse = findViewById<Spinner>(R.id.spCourse)
        val spSubject = findViewById<Spinner>(R.id.spSubject)
        val sliderHours = findViewById<Slider>(R.id.sliderHours)
        val tvHours = findViewById<TextView>(R.id.tvHours)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)

        // Courses
        val courses = listOf("Select Course", "B.E / B.Tech", "PU / 12th", "Self Learning")
        spCourse.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, courses)

        // Subjects mapping
        val subjectMap = mapOf(
            "B.E / B.Tech" to listOf("Data Structures", "OS", "DBMS", "CN"),
            "PU / 12th" to listOf("Maths", "Physics", "Chemistry"),
            "Self Learning" to listOf("Python", "Java", "AI Basics")
        )

        spCourse.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                val selectedCourse = courses[position]
                val subjects = subjectMap[selectedCourse] ?: listOf("Select Subject")
                spSubject.adapter = ArrayAdapter(
                    this@MainActivity,
                    android.R.layout.simple_spinner_dropdown_item,
                    subjects
                )
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        sliderHours.addOnChangeListener { _, value, _ ->
            tvHours.text = "Hours per day: ${value.toInt()}"
        }

        btnGenerate.setOnClickListener {
            val course = spCourse.selectedItem.toString()
            val subject = spSubject.selectedItem.toString()
            val hours = sliderHours.value.toInt()

            if (course == "Select Course") {
                Toast.makeText(this, "Please select a course", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Course: $course\nSubject: $subject\nHours: $hours",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
