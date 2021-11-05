package com.example.androidlab3.task3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.example.androidlab3.databinding.Activity2Binding

class Activity2_3 : AppCompatActivity() {
    private val toFirstRequest = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirst.setOnClickListener {
            finish()
        }

        binding.toThird.setOnClickListener {
            startActivity(Intent(this, Activity3_3::class.java))
        }

        binding.bottomNav.get(0).setOnClickListener {
            startActivity(Intent(this, ActivityAbout::class.java))
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