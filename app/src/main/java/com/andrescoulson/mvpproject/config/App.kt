package com.andrescoulson.mvpproject.config

import android.app.Application

/**
 * Created by andresbobadilla on 16/10/18.
 */
class App : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}