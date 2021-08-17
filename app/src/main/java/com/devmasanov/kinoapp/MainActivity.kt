package com.devmasanov.kinoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
//    private lateinit var binding: TopAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = TopAppBarBinding.inflate(layoutInflater)
//        val view = binding.root
    }

    fun onClickToast(view: View) {
        Toast.makeText(this, "Hi Great! Somebody told me you have a boyfriend",Toast.LENGTH_SHORT).show()
    }

}