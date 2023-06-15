package com.example.loggingapp.data.logRetrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
                //Primera parte de la url acabado en /
            .baseUrl("https://run.mocky.io/")
                //para convertir el gson en la clase
            .addConverterFactory(GsonConverterFactory.create())
                //para construir el retrofit
            .build()
    }
}