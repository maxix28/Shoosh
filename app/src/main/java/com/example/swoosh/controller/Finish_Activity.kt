package com.example.swoosh.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.SKILL
import com.example.swoosh.databinding.ActivityFinishBinding

class Finish_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val league= intent.getStringExtra(EXTRA_LEAGUE)
        val skill= intent.getStringExtra(SKILL)
        binding.searchLeagueText.text="Looking for $league $skill league near you..."
    }

}