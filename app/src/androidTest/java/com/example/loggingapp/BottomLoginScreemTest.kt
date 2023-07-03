package com.example.loggingapp

import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.example.loggingapp.UI.BottomLogingScreem
import org.junit.Rule
import org.junit.Test
import androidx.compose.ui.test.junit4.createComposeRule


class BottomLoginScreemTest {
    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun whenAppStart_thenVerifyComponentExist() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component1").assertExists()
    }
}

