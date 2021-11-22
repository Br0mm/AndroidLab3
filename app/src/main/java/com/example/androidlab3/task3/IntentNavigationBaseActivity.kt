package com.example.androidlab3.task3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import com.example.androidlab3.BaseActivity
import com.example.androidlab3.R

class Activity1_3 : IntentNavigationBaseActivity(R.layout.activity1, false)
class Activity2_3 : IntentNavigationBaseActivity(R.layout.activity2, true)
class Activity3_3 : IntentNavigationBaseActivity(R.layout.activity3, true)

abstract class IntentNavigationBaseActivity(@LayoutRes private val res: Int, private val hasSupportNavigateUp: Boolean) : BaseActivity(res) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }
}