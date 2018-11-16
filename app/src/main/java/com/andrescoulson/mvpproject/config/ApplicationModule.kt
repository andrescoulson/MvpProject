package com.andrescoulson.mvpproject.config

import com.andrescoulson.mvpproject.config.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by andresbobadilla on 16/10/18.
 */

@Module
class ApplicationModule(val app: App) {
    @Provides
    @Singleton
    fun provideApp() = app
}