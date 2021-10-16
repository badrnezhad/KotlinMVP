package net.holosen.mvpapplication.login.data

import net.holosen.mvpapplication.login.LoginContract
import java.util.*

class LoginInteractor(private val presenter: LoginContract.LoginPresenter) {
    fun login(userCredential: UserCredential) {
        if (hasError(userCredential)) {
            return
        }
        presenter.onSuccess()
    }

    private fun hasError(userCredential: UserCredential): Boolean {
        //user : admin , pass : 123
        if (userCredential.username.isEmpty() || userCredential.password.isEmpty()) {
            presenter.onError("Please enter username and password")
            return true
        }
        //fixme: load user info from database or api by username and password
        val user = UserCredential("admin", "123")
        if (userCredential.username.lowercase(Locale.getDefault()) != user.username.lowercase(Locale.getDefault()) ||
            userCredential.password != user.password
        ) {
            presenter.onError("Incorrect username or password")
            return true
        }
        return false
    }
}