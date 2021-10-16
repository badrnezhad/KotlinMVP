package net.holosen.mvpapplication.login

import net.holosen.mvpapplication.login.data.UserCredential

interface LoginContract {

    interface LoginView {

        fun onError(message: String)

        fun onSuccess()

        fun showLoading()

        fun hideLoading()
    }

    interface LoginPresenter {

        fun doLogin(userCredential: UserCredential)

        fun onError(message: String)

        fun onSuccess()
    }
}