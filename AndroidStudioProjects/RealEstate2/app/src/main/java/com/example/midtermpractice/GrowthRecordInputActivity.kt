package com.example.midtermpractice

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.realestate.R
import android.widget.Button
import android.widget.Toast

class GrowthRecordInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_growth_record_input)

        val editBabyName = findViewById<EditText>(R.id.editBabyName)
        val editBirthDate = findViewById<EditText>(R.id.editBirthDate)
        val editWeight = findViewById<EditText>(R.id.editWeight)
        val editHeight = findViewById<EditText>(R.id.editHeight)
        val editMilestone = findViewById<EditText>(R.id.editMilestone)
        val buttonSave = findViewById<Button>(R.id.buttonSave)

        buttonSave.setOnClickListener{
            val babyNameStr = editBabyName.text.toString()
            val birthDateStr = editBirthDate.text.toString()
            val weightStr = editWeight.text.toString()
            val heightStr = editHeight.text.toString()
            val milestoneStr = editMilestone.text.toString()

            if(babyNameStr.isEmpty() || birthDateStr.isEmpty() || weightStr.isEmpty() || heightStr.isEmpty() || milestoneStr.isEmpty()){
                Toast.makeText(this, "Please input all fields!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Listing Successful", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, DataActivity::class.java)
                intent.putExtra("PASS_BABYNAME", babyNameStr)
                intent.putExtra("PASS_BIRTHDATE", birthDateStr)
                intent.putExtra("PASS_WEIGHT", weightStr)
                intent.putExtra("PASS_HEIGHT", heightStr)
                intent.putExtra("PASS_MILESTONE", milestoneStr)

                startActivity(intent)
            }
        }
    }
}