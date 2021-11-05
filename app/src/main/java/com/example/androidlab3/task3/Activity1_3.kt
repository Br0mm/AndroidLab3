package com.example.androidlab3.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.example.androidlab3.databinding.Activity1Binding

class Activity1_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            startActivity(Intent(this, Activity2_3::class.java))
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
