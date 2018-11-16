package com.andrescoulson.mvpproject.login

import dagger.Module
import dagger.Provides

/**
 * Created by andresbobadilla on 17/10/18.
 */
@Module
class LoginModule() {

    @Provides
    fun providesLoginPresenter(model: LoginModel): LoginPresenter {
        return LoginPresenter(model)
    }

    @Provides
    fun provideLoginModel(respository: LoginRepository): LoginModel {
        return LoginModel(respository)
    }

    @Provides
    fun provideLoginRepository(): LoginRepository {
        return MemoryRepository()
    }
}