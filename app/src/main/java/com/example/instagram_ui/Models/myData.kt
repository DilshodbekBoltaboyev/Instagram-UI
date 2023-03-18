package com.example.instagram_ui.Models

import Models.Rasm
import com.example.instagram_ui.R

object myData {

    val list=ArrayList<Rasm>()

    fun add(){
        list.add(Rasm(R.drawable.captain_2,"Captain America"))
        list.add(Rasm(R.drawable.spider_man_2,"Spider Man"))
    }
}