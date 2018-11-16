package com.andrescoulson.mvpproject.login

/**
 * Created by andresbobadilla on 17/10/18.
 */
interface LoginRepository {

    fun saveUser(user:User?)

    fun getUser(): User?

}