package net.holosen.mvpapplication.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import net.holosen.mvpapplication.R
import net.holosen.mvpapplication.login.LoginActivity

class MainActivity : AppCompatActivity(), MainContract.MainView {

    private lateinit var presenter: MainContract.MainPresenter
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        bindViews()
        presenter = MainPresenterImpl(this)
        btnLogin.setOnClickListener {
            presenter.handleLoginButton()
        }
    }

    private fun bindViews() {
        btnLogin = findViewById(R.id.btnLogin)
    }

    override fun showLoginView() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}