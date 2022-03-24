package com.example.viewbinding_navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.example.viewbinding_navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            bToggleDrawer.setOnClickListener {
                mainDrawer.openDrawer(GravityCompat.END)
                mainDrawer.openDrawer(GravityCompat.START)
            }
        }


    }
}