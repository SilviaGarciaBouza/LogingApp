package com.example.loggingapp.UI

import android.util.Log
import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.loggingapp.domain.UseCaseLoging
import kotlinx.coroutines.launch

class LogingViewModel: ViewModel() {

    //Se mete el useCaseLoging q ya es la acción(en este caso saber si la respuesta es true o false) ya no hace falta meterle  . y alguna fun
   val useCaseLoging = UseCaseLoging()

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _enabledButton = MutableLiveData<Boolean>()
    val enabledButton: LiveData<Boolean> = _enabledButton


    private val _selectedButton = MutableLiveData<Boolean>()
    val selectedButton: LiveData<Boolean> = _selectedButton


    fun changeEmailPassword(myEmail: String, myPassword: String){
        _email.value = myEmail
        _password.value = myPassword
        _enabledButton.value = isEnabledButton(myEmail, myPassword)
    }
    fun isEnabledButton(email: String, password: String): Boolean{
       return if(Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6){true}
        else{false}
    }

    //fun con el caso de uso: si el success(larespuesta) es true hace algo
    fun logSuccessful(){
        //par q sea en hilo secundario:
        viewModelScope.launch {
            _selectedButton.value = false
            val result = useCaseLoging(email.value!!, password.value!!)
            if (result){
                //la acción, como navegar a...
                Log.i("test", "Its OK")
            }
            _selectedButton.value= true
        }

    }

}