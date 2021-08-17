package com.devmasanov.kinoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickToast(view: View) {
        Toast.makeText(this, "Hi Great! Somebody told me you have a boyfriend",Toast.LENGTH_SHORT).show()
    }

}