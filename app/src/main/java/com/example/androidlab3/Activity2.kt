package com.example.androidlab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirst.setOnClickListener {
            finish()
        }

        binding.toThird.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
    }
}