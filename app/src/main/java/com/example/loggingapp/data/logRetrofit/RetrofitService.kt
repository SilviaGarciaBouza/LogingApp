package com.example.loggingapp.data.logRetrofit

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

//Preparar para inyectar y ser inyectado de dependencias
class RetrofitService @Inject constructor(private val retrofit: Retrofit){
    //private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(name: String, password: String): Boolean{
        //(Dispatchers.IO) en hilo secundario
        return withContext(Dispatchers.IO){
            //val response = retrofit.create(RetrofitCLient::class.java).doLogin(name, password)
            val response = retrofit.create(RetrofitCLient::class.java).doLogin()

            response.body()?.success ?: false
        }
    }
}