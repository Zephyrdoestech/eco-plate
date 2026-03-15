package com.example.ecoplate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DashboardActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
//
//        val buttonProfile = findViewById<Button>(R.id.buttonProfile)
//        val buttonLogout = findViewById<Button>(R.id.buttonLogout)
//
//        val passedUsername = intent.getStringExtra("EXTRA_USERNAME")
//
//        buttonProfile.setOnClickListener {
//            val intentToProfile = Intent(this, ProfileActivity::class.java)
//
//            intentToProfile.putExtra("EXTRA_USERNAME", passedUsername)
//
//            startActivity(intentToProfile)
//        }
//
//        buttonLogout.setOnClickListener {
//            val intentToLogin = Intent(this, LoginActivity::class.java)
//            startActivity(intentToLogin)
//            finish()
//        }

        val buttonProfile = findViewById<Button>(R.id.buttonProfile)
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        val textviewWelcome = findViewById<TextView>(R.id.textviewWelcome)

        val loggedInUser = intent.getStringExtra("PASS_USERNAME")
        val loggedInPass = intent.getStringExtra("PASS_PASSWORD")

        if(loggedInUser != null && loggedInUser.isNotEmpty()) {
            textviewWelcome.text = "Welcome to EcoPlate! $loggedInUser"
        }

        buttonProfile.setOnClickListener {
            val intent = Intent(this@DashboardActivity, ProfileActivity::class.java)
            intent.putExtra("PASS_USERNAME", loggedInUser)
            intent.putExtra("PASS_PASSWORD", loggedInPass)
            startActivity(intent)
        }

        buttonLogout.setOnClickListener {
            finish()
        }
    }
}