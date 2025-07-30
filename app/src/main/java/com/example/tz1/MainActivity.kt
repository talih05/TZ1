package com.example.tz1


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tz1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

     private val viewModel:MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.editTextVM.observe(this){ text ->
            binding.editText.setText(text)
        }

        binding.buttonOpen.setOnClickListener {
            val inputText = binding.editText.text.toString()
            viewModel.setEditText(inputText)

            val intent = Intent (this,SavedNotesActivity::class.java)
            intent.putExtra("text_key", inputText)
            startActivity(intent)
        }

        binding.buttonRemove.setOnClickListener {
            viewModel.clearText()
        }

    }

}