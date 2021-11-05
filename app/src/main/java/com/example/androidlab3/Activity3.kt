package com.example.androidlab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            finish()
        }

        binding.toFirst.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
    }
}