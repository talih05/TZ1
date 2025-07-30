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
    private val viewModel:MyViewModel2 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SavedNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultText = intent.getStringExtra("text_key")

        if (viewModel.textView.value == null && resultText!= null) {
            viewModel.setTextView(resultText)
        }

        viewModel.textView.observe(this){text ->
            binding.textV.text= text
        }
    }
}