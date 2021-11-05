package com.example.androidlab3.task2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.example.androidlab3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private val toFirstRequest = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirst.setOnClickListener {
            finish()
        }

        binding.toThird.setOnClickListener {
            startActivityForResult(Intent(this, Activity3::class.java), toFirstRequest)
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == toFirstRequest) {
            if (resultCode == Activity3.TO_FIRST) {
                finish()
            }
        }
    }
}