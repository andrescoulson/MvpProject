package com.andrescoulson.mvpproject.login

/**
 * Created by andresbobadilla on 17/10/18.
 */
class LoginPresenter(var loginModel: LoginMvp.LoginModel) : LoginMvp.LoginPresenter {

    private lateinit var loginView: LoginMvp.LoginView

    override fun setView(view: LoginMvp.LoginView) {
        this.loginView = view
    }

    override fun loginClick() {

        if (loginView.getFirstName().isEmpty() || loginView.getLastName().isEmpty())
            loginView.showInputError("Error")
        else {
            loginModel.createUser(loginView.getFirstName().trim(), loginView.getLastName().trim())
            loginView.showUserAvailable()
        }
    }

    override fun getCurrentUser() {
        if (loginModel.getUser() == null)
            loginView.showUserNotAvailable()
        else {
            loginView.setFirstName(loginModel.getUser()!!.firtsname)
            loginView.setLastName(loginModel.getUser()!!.lastName)
        }

    }
}