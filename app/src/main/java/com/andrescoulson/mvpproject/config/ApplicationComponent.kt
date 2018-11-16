package com.andrescoulson.mvpproject.config

import com.andrescoulson.mvpproject.MainComponent
import com.andrescoulson.mvpproject.MainModule
import com.andrescoulson.mvpproject.login.LoginComponet
import com.andrescoulson.mvpproject.login.LoginModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by andresbobadilla on 16/10/18.
 */

@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(app: App)
    fun plus(mainModule: MainModule): MainComponent
    fun login(loginModule: LoginModule):LoginComponet
}