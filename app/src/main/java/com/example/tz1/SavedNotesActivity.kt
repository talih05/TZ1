package com.example.tz1

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tz1.databinding.SavedNotesBinding

class SavedNotesActivity : AppCompatActivity() {

    private lateinit var binding: SavedNotesBinding
    private val viewModel:MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SavedNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultText = intent.getStringExtra("text_key")
        binding.textV.text = resultText
    }
}