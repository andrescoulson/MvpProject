package com.andrescoulson.mvpproject

import dagger.Subcomponent

/**
 * Created by andresbobadilla on 16/10/18.
 */

@Subcomponent(modules = [(MainModule::class)])
interface MainComponent {
    fun inject(activity: MainActivity)
}