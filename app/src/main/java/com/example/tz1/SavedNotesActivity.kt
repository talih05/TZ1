package com.example.tz1

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SavedNotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saved_notes)

        val TextView = findViewById<TextView>(R.id.textV)

        val sharedPref = getSharedPreferences("saved_note",Context.MODE_PRIVATE)
        val note = sharedPref.getString("savenote","Пусто")
        TextView.text = note

    }
}