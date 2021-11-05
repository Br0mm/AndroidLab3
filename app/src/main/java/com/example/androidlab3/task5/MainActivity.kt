package com.example.androidlab3.task5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.androidlab3.R
import com.example.androidlab3.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
        binding.bottomNav.setOnItemSelectedListener {
            if (it.itemId == R.id.activityAbout) {
                navController.navigate(R.id.activityAbout)
                return@setOnItemSelectedListener true
            }
            false
        }
    }
}