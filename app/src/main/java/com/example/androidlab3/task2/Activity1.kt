package com.example.androidlab3.task2

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.androidlab3.R

class Activity1 : BaseActivity(R.layout.activity1) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<View>(R.id.bnToSecond).setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
