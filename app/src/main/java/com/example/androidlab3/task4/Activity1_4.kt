package com.example.androidlab3.task4

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3.databinding.Activity1Binding

class Activity1_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            val intent = Intent(this, Activity1_4::class.java)
            intent.flags = FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }
}
