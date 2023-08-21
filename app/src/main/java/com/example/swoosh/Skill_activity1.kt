package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Skill_activity1 : BaseActivity() {
    var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill1)
        league= intent.getStringExtra(EXTRA_LEAGUE).toString()
        println( "SELECTED LEAGUA!!!!!!!!!!!!! "+league)
    }
}