package com.example.markpadua.loginactivity.Contract

interface ILoginPresenter {

    fun login(username : String, password:String)
    fun setView(view:ILoginView)

}