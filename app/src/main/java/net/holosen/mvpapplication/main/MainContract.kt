package net.holosen.mvpapplication.main

interface MainContract {

    interface MainView {
        fun showLoginView()
    }

    interface MainPresenter {
        fun handleLoginButton()
    }

}