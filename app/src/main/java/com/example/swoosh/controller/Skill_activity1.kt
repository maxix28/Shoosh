package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivitySkill1Binding
import com.example.swoosh.model.Player

class Skill_activity1 : BaseActivity() {
  lateinit var player: Player
    private lateinit var binding: ActivitySkill1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill1)
        binding = ActivitySkill1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        player= intent.getParcelableExtra(EXTRA_PLAYER)!!

        println( "SELECTED LEAGUA!!!!!!!!!!!!! "+ player.league)
    }
    fun finishPage(view: View){
        println("FINISH         PAGE            STARTS                 OPENING")
        if(player.skill!=""){
            val FinishIntent= Intent(this,Finish_Activity::class.java)

       // val FinishIntent= Intent(this,Finish_Activity::class.java)
//            FinishIntent.putExtra(EXTRA_LEAGUE,league)
//            FinishIntent.putExtra(SKILL,skill)
            FinishIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(FinishIntent)

        }
        else{
            Toast.makeText(this,"Choose your skill",Toast.LENGTH_SHORT).show()
        }
    }
    fun onbeginnerClick(view: View){
        binding.ballerSkillBTN.isChecked=false
        player.  skill="beginner"
    }
   fun onBallerClick(view:View){
        binding.begginerSkillBTN.isChecked=false
       player.  skill="baller"

    }
}