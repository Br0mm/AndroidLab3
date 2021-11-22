package com.example.androidlab3.task2

import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseActivity(@LayoutRes private val res: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(res)

        findViewById<BottomNavigationView>(R.id.navView)?.setOnItemSelectedListener {
            if (it.itemId == R.id.activityAbout) {
                startActivity(Intent(this, ActivityAbout::class.java))
                return@setOnItemSelectedListener true
            }
            false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}