package com.example.loggingapp.data.logRetrofit

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RetrofitService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(name: String, password: String): Boolean{
        //(Dispatchers.IO) en hilo secundario
        return withContext(Dispatchers.IO){
            //val response = retrofit.create(RetrofitCLient::class.java).doLogin(name, password)
            val response = retrofit.create(RetrofitCLient::class.java).doLogin()

            response.body()?.success ?: false
        }
    }
}