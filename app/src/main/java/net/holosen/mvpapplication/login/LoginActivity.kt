package net.holosen.mvpapplication.login

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import net.holosen.mvpapplication.R
import net.holosen.mvpapplication.login.data.UserCredential

class LoginActivity : AppCompatActivity(), LoginContract.LoginView {

    private lateinit var txtUsername: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnSignIn: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var presenter: LoginContract.LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }

    private fun init() {
        bindViews()
        presenter = LoginPresenterImpl(this)
        btnSignIn.setOnClickListener {
            val username = txtUsername.text.toString()
            val password = txtPassword.text.toString()
            val userCredential = UserCredential(username, password)
            presenter.doLogin(userCredential)
        }
    }

    private fun bindViews() {
        txtUsername = findViewById(R.id.txtUsername)
        txtPassword = findViewById(R.id.txtPassword)
        btnSignIn = findViewById(R.id.btnSignIn)
        progressBar = findViewById(R.id.progressBar)
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onSuccess() {
        Toast.makeText(this, "Login Succeed!", Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
        btnSignIn.visibility = View.GONE
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
        btnSignIn.visibility = View.VISIBLE
    }
}