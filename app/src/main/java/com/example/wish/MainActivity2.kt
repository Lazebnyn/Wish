package com.example.wish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wish.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var bindingclass : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingclass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingclass.root)
    }

    fun onClickStart (view: View){
        val i = Intent(this, MainActivity::class.java)
        i.putExtra("Начать", "")
        startActivityForResult(i, 1)
    }
}