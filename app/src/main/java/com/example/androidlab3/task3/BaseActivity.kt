package com.example.androidlab3.task3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab3.ActivityAbout
import com.example.androidlab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity1_3 : BaseActivity(R.layout.activity1, false)
class Activity2_3 : BaseActivity(R.layout.activity2, true)
class Activity3_3 : BaseActivity(R.layout.activity3, true)

abstract class BaseActivity(@LayoutRes private val res: Int, private val hasSupportNavigateUp: Boolean) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(res)
        supportActionBar?.setDisplayHomeAsUpEnabled(hasSupportNavigateUp)

        findViewById<View>(R.id.bnToFirst)?.setOnClickListener {
            startActivity(Intent(this, Activity1_3::class.java))
        }

        findViewById<View>(R.id.bnToSecond)?.setOnClickListener {
            startActivity(Intent(this, Activity2_3::class.java))
        }

        findViewById<View>(R.id.bnToThird)?.setOnClickListener {
            startActivity(Intent(this, Activity3_3::class.java))
        }

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