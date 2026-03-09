package com.example.ecoplate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
//
//        buttonSubmit.setOnClickListener {
//            val intentToLogin = Intent(this, LoginActivity::class.java)
//            startActivity(intentToLogin)
//            finish()
//        }


        val edittextUsername = findViewById<EditText>(R.id.edittextUsername)
        val edittextPassword = findViewById<EditText>(R.id.edittextPassword)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        val edittextRePassword = findViewById<EditText>(R.id.edittextRePassword)

        buttonSubmit.setOnClickListener {
            val usernameStr = edittextUsername.text.toString()
            val passwordStr = edittextPassword.text.toString()
            val rePasswordStr = edittextRePassword.text.toString()

            if(passwordStr == rePasswordStr && passwordStr.isNotEmpty()){
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)

                intent.putExtra("PASS_USERNAME", edittextUsername.text.toString())
                intent.putExtra("PASS_PASSWORD", edittextPassword.text.toString())

                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                edittextRePassword.error = "Passwords must match"
            }

        }

    }
}