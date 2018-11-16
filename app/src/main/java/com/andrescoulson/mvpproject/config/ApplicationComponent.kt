package com.andrescoulson.mvpproject.config

import com.andrescoulson.mvpproject.login.LoginActivity
import com.andrescoulson.mvpproject.login.LoginModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by andresbobadilla on 16/10/18.
 */

@Singleton
@Component(modules = [(ApplicationModule::class),(LoginModule::class)])
interface ApplicationComponent {
    fun inject(app: LoginActivity)
}