package com.example.midtermpractice

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.realestate.R
import android.content.Intent

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val displayBabyName = findViewById<TextView>(R.id.tvBabyName)
        val displayBirthDate = findViewById<TextView>(R.id.tvBirthDate)
        val displayWeight = findViewById<TextView>(R.id.tvWeight)
        val displayHeight = findViewById<TextView>(R.id.tvHeight)
        val displayMilestone = findViewById<TextView>(R.id.tvMilestone)

        val passedName = intent.getStringExtra("PASS_BABYNAME")
        val passedBirthDate = intent.getStringExtra("PASS_BIRTHDATE")
        val passedWeight = intent.getStringExtra("PASS_WEIGHT")
        val passedHeight = intent.getStringExtra("PASS_HEIGHT")
        val passedMilestone = intent.getStringExtra("PASS_MILESTONE")

        displayBabyName.text = "Baby Name: $passedName"
        displayBirthDate.text = "Birth Date: $passedBirthDate"
        displayWeight.text = "Weight: $passedWeight"
        displayHeight.text = "Height: $passedHeight"
        displayMilestone.text = "Milestone: $passedMilestone"

    }
}