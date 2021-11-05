package com.example.androidlab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
