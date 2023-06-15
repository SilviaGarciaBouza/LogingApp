package com.example.loggingapp.data.logRetrofit

import com.google.gson.annotations.SerializedName
//En @SerializedName(value =  "success") pones el nombre q aparece el de val puede ser otro
data class RetrofitResponse (@SerializedName(value =  "success") val success: Boolean)