package com.example.loggingapp.domain

import com.example.loggingapp.data.LogRepository
import javax.inject.Inject

//Inyección de dependencias con @Inject constructor
class UseCaseLoging @Inject constructor(private val repository: LogRepository){
    //private val repository = LogRepository()
    suspend operator fun invoke(name: String, password: String): Boolean {
        return repository.doLogin(name, password)
    }
}