package com.example.androidlab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.databinding.ActivityAboutBinding

class ActivityAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            finish()
        }
    }
}