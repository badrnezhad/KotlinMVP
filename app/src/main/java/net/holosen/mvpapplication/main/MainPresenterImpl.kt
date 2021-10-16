package net.holosen.mvpapplication.main

class MainPresenterImpl(private val view: MainContract.MainView) : MainContract.MainPresenter {
    override fun handleLoginButton() {
        view.showLoginView()
    }
}