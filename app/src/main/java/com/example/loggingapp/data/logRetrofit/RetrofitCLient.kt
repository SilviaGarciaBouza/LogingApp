package com.example.loggingapp.data.logRetrofit

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitCLient {
    //Segunda parte de la url empezando con /
    @GET(value= "/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")
    //En hilo secundario. Devuelve un response del tipo de datos retrofitResponse
    //suspend fun doLogin(name:String, password: String):Response<RetrofitResponse>
    suspend fun doLogin():Response<RetrofitResponse>

}