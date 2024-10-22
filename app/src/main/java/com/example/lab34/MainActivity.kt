package com.example.lab34

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewName.setOnClickListener {
            binding.textViewName.setTextColor(Color.RED)
        }

        binding.textViewGroup.setOnClickListener {
            binding.textViewGroup.setTextColor(Color.GREEN)
        }

        binding.textViewCity.setOnClickListener {
            binding.textViewCity.setTextColor(Color.BLUE)
        }

        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = android.view.View.INVISIBLE
        }

        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = android.view.View.VISIBLE
        }
    }
}