package com.example.loggingapp.data

import com.example.loggingapp.data.logRetrofit.RetrofitService
import javax.inject.Inject

//preparar para ser inyectado e inyectar dependencias:
class LogRepository @Inject constructor(private val api: RetrofitService) {
    //private val api = RetrofitService()

    suspend fun doLogin(name: String, password: String): Boolean{
        return api.doLogin(name, password)
    }
}