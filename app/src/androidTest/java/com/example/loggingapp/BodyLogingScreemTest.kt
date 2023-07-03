package com.example.loggingapp

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.loggingapp.UI.BodyLogingScreem
import com.example.loggingapp.UI.BottomLogingScreem
import com.example.loggingapp.UI.LogingViewModel
import com.example.loggingapp.data.LogRepository
import com.example.loggingapp.data.logRetrofit.RetrofitService
import com.example.loggingapp.domain.UseCaseLoging
import org.junit.Rule
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class BodyLogingScreemTest {

        @get:Rule
        val composeTestRule = createComposeRule()


        @Test
        fun whenAppStart_thenVerifyComponent1ExistAndVisible() {
            fun provideRetrofit(): Retrofit{
                return Retrofit.Builder()
                    //Primera parte de la url acabado en /
                    .baseUrl("https://run.mocky.io/")
                    //para convertir el gson en la clase
                    .addConverterFactory(GsonConverterFactory.create())
                    //para construir el retrofit
                    .build()
            }
           val viewModel= LogingViewModel (UseCaseLoging(LogRepository(RetrofitService(provideRetrofit() ))))

            composeTestRule.setContent {
                BodyLogingScreem(viewModel)
            }
            composeTestRule.onNodeWithTag("component1").assertExists()

        }





    @Test
    fun whenemailAndPasswordAreTrue_thenButtonIsEnable() {
        fun provideRetrofit(): Retrofit{
            return Retrofit.Builder()
                //Primera parte de la url acabado en /
                .baseUrl("https://run.mocky.io/")
                //para convertir el gson en la clase
                .addConverterFactory(GsonConverterFactory.create())
                //para construir el retrofit
                .build()
        }
        val viewModel= LogingViewModel (UseCaseLoging(LogRepository(RetrofitService(provideRetrofit() ))))

        composeTestRule.setContent {
            BodyLogingScreem(viewModel)
        }
        composeTestRule.onNodeWithTag("email").performTextClearance()
        //reemplazar el texto del componente, cambia el textfield vamos
        composeTestRule.onNodeWithTag("email").performTextReplacement("daw@sap.com")


        composeTestRule.onNodeWithTag("password").performTextClearance()
        //reemplazar el texto del componente, cambia el textfield vamos
        composeTestRule.onNodeWithTag("password").performTextReplacement("sfghuik")


        composeTestRule.onNodeWithTag("component1").assertIsEnabled()

    }


}