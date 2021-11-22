package com.example.androidlab3.task2

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.androidlab3.BaseActivity
import com.example.androidlab3.R

class Activity2 : BaseActivity(R.layout.activity2) {
    private val toFirstRequest = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<View>(R.id.bnToFirst).setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.bnToThird).setOnClickListener {
            startActivityForResult(Intent(this, Activity3::class.java), toFirstRequest)
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