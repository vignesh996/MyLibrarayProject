package com.example.mylib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Library

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Library.myLog("Library called")
    }
}