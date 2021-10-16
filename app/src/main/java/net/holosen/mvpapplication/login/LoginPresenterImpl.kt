package net.holosen.mvpapplication.login

import net.holosen.mvpapplication.login.data.LoginInteractor
import net.holosen.mvpapplication.login.data.UserCredential

class LoginPresenterImpl(
    private val view: LoginContract.LoginView
) : LoginContract.LoginPresenter {

    private val interactor = LoginInteractor(this)

    override fun doLogin(userCredential: UserCredential) {
        view.showLoading()
        interactor.login(userCredential)
    }

    override fun onError(message: String) {
        view.hideLoading()
        view.onError(message)
    }

    override fun onSuccess() {
        view.hideLoading()
        view.onSuccess()
    }
}