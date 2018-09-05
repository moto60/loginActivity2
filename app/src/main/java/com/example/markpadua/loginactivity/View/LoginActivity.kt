package com.example.markpadua.loginactivity.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.markpadua.loginactivity.R
import com.example.markpadua.loginactivity.Contract.ILoginView
import com.example.markpadua.loginactivity.Presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() ,    ILoginView {

    private lateinit var loginView : LoginPresenter

    override fun loginsuccess() {
        Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show()
    }

    override fun loginfailed() {
        Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginView = LoginPresenter()
        loginView.setView(this)

        bt_Login.setOnClickListener{
            loginView.login(et_Username.text.toString(),et_Password.text.toString())
        }



    }
}


