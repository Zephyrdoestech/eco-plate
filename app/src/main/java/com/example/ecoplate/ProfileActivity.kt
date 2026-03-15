package com.example.ecoplate

import android.net.Uri
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private val pickImageLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) {uri:Uri? ->
        if(uri != null) {
            val imageviewLogo = findViewById<ImageView>(R.id.imageviewLogo)
            imageviewLogo.setImageURI(uri)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//        val buttonBackToDashboard = findViewById<Button>(R.id.buttonBackToDashboard)
//
//        val textviewUsername = findViewById<TextView>(R.id.textviewUsername)
//
//        val finalUsername = intent.getStringExtra("EXTRA_USERNAME")
//
//        if (!finalUsername.isNullOrEmpty()) {
//            textviewUsername.text = "Username: $finalUsername"
//        }
//
//        buttonBackToDashboard.setOnClickListener {
//
//            finish()
//        }
        
        val buttonBackToDashBoard = findViewById<Button>(R.id.buttonBackToDashboard)
        val textviewUsername = findViewById<TextView>(R.id.textviewUsername)
        val textviewPassword = findViewById<TextView>(R.id.textviewPassword)

        val imageviewLogo = findViewById<ImageView>(R.id.imageviewLogo)
        
        val finalUser = intent.getStringExtra("PASS_USERNAME")
        val finalPass = intent.getStringExtra("PASS_PASSWORD")
        
        if(finalUser != null) textviewUsername.text = "Username: $finalUser"
        if(finalPass != null) textviewPassword.text = "Password: $finalPass"

        imageviewLogo.setOnClickListener {
            pickImageLauncher.launch("image/*")
        }

        buttonBackToDashBoard.setOnClickListener {
            finish()
        }
    }
}