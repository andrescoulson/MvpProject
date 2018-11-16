package com.andrescoulson.mvpproject.config

import android.app.Application
import com.andrescoulson.mvpproject.login.LoginModule

/**
 * Created by andresbobadilla on 16/10/18.
 */
class App : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .loginModule(LoginModule())
                .build()
    }

}