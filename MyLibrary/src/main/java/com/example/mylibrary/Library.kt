package com.example.mylibrary

import android.util.Log

class Library {

    companion object{

        fun myLog(message : String){
            Log.d("TAG", "myLog: $message")
        }
    }
}