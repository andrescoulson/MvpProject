package com.andrescoulson.mvpproject.login

import dagger.Component

/**
 * Created by andresbobadilla on 17/10/18.
 */

@Component(modules = [(LoginModule::class)])
interface LoginComponet {
    fun inject(activity: LoginActivity)
}