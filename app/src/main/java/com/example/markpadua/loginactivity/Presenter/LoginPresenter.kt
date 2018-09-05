package com.example.markpadua.loginactivity.Presenter

import com.example.markpadua.loginactivity.Contract.ILoginPresenter
import com.example.markpadua.loginactivity.Contract.ILoginView
import com.example.markpadua.loginactivity.View.LoginActivity

class LoginPresenter: ILoginPresenter {


    private lateinit var  loginview: ILoginView


    override fun setView(view: ILoginView) {
        loginview = view
    }


    override fun login(username: String, password: String) {

        if(username == "user1" && password == "password"){
            //success
            loginview.loginsuccess()

        }else{
            //failed
            loginview.loginfailed()
        }
    }


}