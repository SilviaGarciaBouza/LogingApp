package com.example.loggingapp.domain

import com.example.loggingapp.data.LogRepository

class UseCaseLoging {

    private val repository = LogRepository()

    suspend operator fun invoke(name: String, password: String): Boolean {
        return repository.doLogin(name, password)
    }
}