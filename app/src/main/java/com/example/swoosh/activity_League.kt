package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.databinding.ActivityLeagueBinding
class activity_League : BaseActivity() {
    var selectedString=""
    private lateinit var binding: ActivityLeagueBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun leauaNextClick(view: View){
        if(        selectedString!="") {
            val skillActivity = Intent(this, Skill_activity1::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedString)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select desired league",Toast.LENGTH_SHORT).show()
        }
    }
    fun menClick(view: View){
binding.womenLeagueBTN.isChecked=false
        binding.COEDLeagueBTN.isChecked=false
        selectedString="mens"
    }
    fun womenClick(view: View){
        binding.menLeagueBTN.isChecked=false
        binding.COEDLeagueBTN.isChecked=false
        selectedString="womens"

    }
    fun co_edClick(view: View){
        binding.menLeagueBTN.isChecked=false
        binding.womenLeagueBTN.isChecked=false
        selectedString="COED"

    }
}