package com.example.androidlab3.task2

import android.os.Bundle
import android.view.View
import com.example.androidlab3.BaseActivity
import com.example.androidlab3.R

class Activity3 : BaseActivity(R.layout.activity3) {
    companion object {
        const val TO_FIRST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<View>(R.id.bnToSecond).setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.bnToFirst).setOnClickListener {
            setResult(TO_FIRST)
            finish()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}