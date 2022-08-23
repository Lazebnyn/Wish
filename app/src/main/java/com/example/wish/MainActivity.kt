package com.example.wish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingclass : ActivityMainBinding
    lateinit var rundom : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rundom = resources.getStringArray(R.array.task)
        bindingclass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingclass.root)
        intent.getStringExtra("Начать")
        bindingclass.tvGame.setOnClickListener{
            bindingclass.tvGame.text = getTask()
        }
    }

    private fun getTask(): String{
        return rundom[rundomNumber()]
    }

    private fun rundomNumber(): Int{
        val size = rundom.size - 1
        return (0..size).random()
    }
}