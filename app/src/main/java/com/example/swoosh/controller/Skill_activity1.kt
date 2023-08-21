package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.SKILL
import com.example.swoosh.databinding.ActivitySkill1Binding

class Skill_activity1 : BaseActivity() {
    var league=""
    var skill=""
    private lateinit var binding: ActivitySkill1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill1)
        binding = ActivitySkill1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        league= intent.getStringExtra(EXTRA_LEAGUE).toString()
        println( "SELECTED LEAGUA!!!!!!!!!!!!! "+league)
    }
    fun finishPage(view: View){
        println("FINISH         PAGE            STARTS                 OPENING")
        if(skill!=""){

        val FinishIntent= Intent(this,Finish_Activity::class.java)
            FinishIntent.putExtra(EXTRA_LEAGUE,league)
            FinishIntent.putExtra(SKILL,skill)
            startActivity(FinishIntent)

        }
        else{
            Toast.makeText(this,"Choose your skill",Toast.LENGTH_SHORT).show()
        }
    }
    fun onbeginnerClick(view: View){
        binding.ballerSkillBTN.isChecked=false
        skill="beginner"
    }
    fun onBallerClick(view:View){
        binding.begginerSkillBTN.isChecked=false
        skill="baller"

    }
}