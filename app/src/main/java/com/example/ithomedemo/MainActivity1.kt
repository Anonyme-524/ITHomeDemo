package com.example.ithomedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity1: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        supportActionBar?.hide()//去掉标题


    }
}