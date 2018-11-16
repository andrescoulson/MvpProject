package com.andrescoulson.mvpproject.login

/**
 * Created by andresbobadilla on 17/10/18.
 */
class MemoryRepository : LoginRepository {

    var userr: User? = null
    override fun saveUser(user: User?) {
        if (user == null) {
            userr = getUser()
        } else
            userr = user

    }

    override fun getUser(): User? {
        if (userr == null) {
            userr = User("Antonio", "Banderas")
            return userr
        }
        return userr
    }
}