package com.example.loggingapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.loggingapp.UI.BottomLogingScreem
import com.example.loggingapp.UI.UpLogingScreem
import org.junit.Rule
import org.junit.Test

class UpLogingScreemTest {
    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun whenAppStart_thenVerifyComponent1ExistAndVisible() {
        composeTestRule.setContent {
            UpLogingScreem()
        }
        composeTestRule.onNodeWithTag("component1").assertExists().assertIsDisplayed()
    }
}