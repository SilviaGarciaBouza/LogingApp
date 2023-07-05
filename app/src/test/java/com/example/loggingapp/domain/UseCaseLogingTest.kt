package com.example.loggingapp.domain

import android.text.method.SingleLineTransformationMethod
import com.example.loggingapp.data.LogRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class UseCaseLogingTest {

    //lateinit del repository(dnd coges la acción, los datos)
    //lateinitn del uso de caso, lo q styás testeando
     @RelaxedMockK
     private lateinit var logRepository: LogRepository
     lateinit var useCaseLoging: UseCaseLoging

    //En before, se pone lo q se hace antes de empezar el test
    // inicia del repositoryy el uso de caso
     @Before
     fun onBefore(){
         MockKAnnotations.init(this)
        useCaseLoging = UseCaseLoging(logRepository)
     }

    //runBlocking pq hay corrutinas
    @Test
    fun whenWhitteNameAndPassword_thenGetABoolean() = runBlocking{
        val name: String = "Sil"
        val password: String = "12345678"

        //Given
        //Corrutina: coEvery, sino Every
        coEvery { logRepository.doLogin(name, password)} returns true

        //When
        useCaseLoging(name, password)

        //Then
        ////Corrutina: coVerify, sino Verify
        coVerify(exactly = 1) { logRepository.doLogin(name, password) }
    }

 }
