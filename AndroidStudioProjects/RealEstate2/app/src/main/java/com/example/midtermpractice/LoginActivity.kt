package com.example.midtermpractice

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.realestate.R
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editUsername = findViewById<EditText>(R.id.editUsername)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
            val userNameStr = editUsername.text.toString()
            val passwordStr = editPassword.text.toString()

            if(userNameStr.isEmpty() || passwordStr.isEmpty()){
                Toast.makeText(this, "Please input all fields!", Toast.LENGTH_SHORT).show()
            }else if(passwordStr.length < 6){
                Toast.makeText(this, "Password too short!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, GrowthRecordInputActivity::class.java)
                startActivity(intent)
            }
        }
    }
}