package com.example.loggingapp.data

import com.example.loggingapp.data.logRetrofit.RetrofitService

class LogRepository {
    private val api = RetrofitService()

    suspend fun doLogin(name: String, password: String): Boolean{
        return api.doLogin(name, password)
    }
}