package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.GetStartedBtn.setOnClickListener {

            val leagueIntent= Intent(this, activity_League::class.java)
            startActivity(leagueIntent)
            //Intent(this,activity_League::class.java)
        }
    }
}
//com.example.swoosh.