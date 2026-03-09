package com.example.ecoplate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
//        val textviewRegisterLink = findViewById<TextView>(R.id.textviewRegisterLink)
//        val edittextUsername = findViewById<EditText>(R.id.edittextUsername)
//
//        buttonLogin.setOnClickListener {
//            val typedUsername = edittextUsername.text.toString()
//
//            val intentToDashboard = Intent(this, DashboardActivity::class.java)
//
//            intentToDashboard.putExtra("EXTRA_USERNAME", typedUsername)
//
//            startActivity(intentToDashboard)
//        }
//
//        textviewRegisterLink.setOnClickListener {
//            val intent = Intent(this, RegisterActivity::class.java)
//            startActivity(intent)
//        }

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val textviewRegisterLink = findViewById<TextView>(R.id.textviewRegisterLink)
        val edittextUsername = findViewById<EditText>(R.id.edittextUsername)
        val edittextPassword = findViewById<EditText>(R.id.edittextPassword)

        val passedUser = intent.getStringExtra("PASS_USERNAME")
        val passedPass = intent.getStringExtra("PASS_PASSWORD")
        if(passedUser != null) edittextUsername.setText(passedUser)
        if(passedPass != null) edittextPassword.setText(passedPass)

        buttonLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
            intent.putExtra("PASS_USERNAME", edittextUsername.text.toString())
            intent.putExtra("PASS_PASSWORD", edittextPassword.text.toString())
            startActivity(intent)
        }

        textviewRegisterLink.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}