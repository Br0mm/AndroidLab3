package com.example.androidlab3.task2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.example.androidlab3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    companion object {
        const val TO_FIRST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            finish()
        }

        binding.toFirst.setOnClickListener {
            setResult(TO_FIRST)
            finish()
        }

        binding.bottomNav.setOnItemSelectedListener {
            if (it.itemId == R.id.activityAbout) {
                startActivity(Intent(this, ActivityAbout::class.java))
                return@setOnItemSelectedListener true
            }
            false
        }
    }
}