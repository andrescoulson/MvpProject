package com.andrescoulson.mvpproject.login

/**
 * Created by andresbobadilla on 17/10/18.
 */
interface LoginMvp {
    interface LoginModel {
        fun createUser(name: String, lastname: String)
        fun getUser(): User?
    }

    interface LoginView {
        fun getFirstName(): String
        fun getLastName(): String
        fun showUserNotAvailable()
        fun showUserAvailable()
        fun showInputError(error: String)
        fun setFirstName(name: String)
        fun setLastName(lastname: String)

    }

    interface LoginPresenter {

        fun setView(view: LoginMvp.LoginView)
        fun loginClick()
        fun getCurrentUser()
    }
}