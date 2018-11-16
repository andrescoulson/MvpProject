package com.andrescoulson.mvpproject.login

import android.database.DatabaseUtils
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.andrescoulson.mvpproject.R
import com.andrescoulson.mvpproject.config.App
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginMvp.LoginView {

    @Inject
    lateinit var presenter: LoginMvp.LoginPresenter
    val AppCompatActivity.app: App
        get() = application as App
    private val component by lazy { app.component.login(LoginModule(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        component.inject(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.setView(this)
    }

    override fun getFirstName(): String {
        return email.text.toString()
    }

    override fun getLastName(): String {
        return password.text.toString()
    }

    override fun showUserNotAvailable() {
        Toast.makeText(this, "Error el usuario no esta disponible!", Toast.LENGTH_SHORT).show()
    }

    override fun showUserAvailable() {
        Toast.makeText(this, "Usuario guardado!", Toast.LENGTH_SHORT).show()

    }

    override fun showInputError(error: String) {
        Toast.makeText(this, "Error el nombre o el lastname no pueden ser vacios!", Toast.LENGTH_SHORT).show()

    }

    override fun setFirstName(name: String) {
        email.setText(name)
    }

    override fun setLastName(lastname: String) {
        password.setText(lastname)
    }
}
