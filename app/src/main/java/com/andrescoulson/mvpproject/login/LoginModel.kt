package com.andrescoulson.mvpproject.login

/**
 * Created by andresbobadilla on 17/10/18.
 */
class LoginModel(val loginRepository: LoginRepository) : LoginMvp.LoginModel {

    override fun createUser(name: String, lastname: String) {
        loginRepository.saveUser(User(name, lastname))
    }

    override fun getUser(): User? {
        return loginRepository.getUser()
    }
}