package com.example.tz1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EditText = findViewById <EditText> (R.id.edit_text)
        val ButtonSave = findViewById<Button>(R.id.button_save)
        val ButtonOpen = findViewById<Button>(R.id.button_open)
        val ButtonRemove = findViewById<Button>(R.id.button_remove)
        lateinit var editText: String
        val sharedPref = getSharedPreferences("saved_note", Context.MODE_PRIVATE)

        ButtonSave.setOnClickListener {
            val editor = sharedPref.edit()
            val editText = EditText.text


            with(editor){
                putString("savenote",editText.toString())
            }.apply()
        }

        ButtonOpen.setOnClickListener {
            intent = Intent(this,SavedNotesActivity::class.java)
            startActivity(intent)
        }

        ButtonRemove.setOnClickListener {
            sharedPref.edit().remove("savenote").apply()
        }

    }

}