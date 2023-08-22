package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivityLeagueBinding
import com.example.swoosh.model.Player

class activity_League : BaseActivity() {

    var player=Player("","")
    private lateinit var binding: ActivityLeagueBinding

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player= savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    fun leauaNextClick(view: View){
        if( player.league!="") {
            val skillActivity = Intent(this, Skill_activity1::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select desired league",Toast.LENGTH_SHORT).show()
        }
    }
    fun menClick(view: View){
binding.womenLeagueBTN.isChecked=false
        binding.COEDLeagueBTN.isChecked=false
        player.league="mens"
    }
    fun womenClick(view: View){
        binding.menLeagueBTN.isChecked=false
        binding.COEDLeagueBTN.isChecked=false
        player.league="womens"

    }
    fun co_edClick(view: View){
        binding.menLeagueBTN.isChecked=false
        binding.womenLeagueBTN.isChecked=false
        player.league="co-ed"

    }
}