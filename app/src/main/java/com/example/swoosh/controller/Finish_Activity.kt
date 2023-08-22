package com.example.swoosh.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivityFinishBinding
import com.example.swoosh.model.Player

class Finish_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val player= intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        binding.searchLeagueText.text="Looking for ${player?.league} ${player?.skill} league near you..."
    }

}