package com.andrescoulson.mvpproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.andrescoulson.mvpproject.config.App

class MainActivity : AppCompatActivity() {


    val AppCompatActivity.app: App
        get() = application as App
    private val component by lazy { app.component.plus(MainModule(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
    }
}
