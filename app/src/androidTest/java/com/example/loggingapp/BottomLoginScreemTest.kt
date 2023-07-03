package com.example.loggingapp

import androidx.compose.ui.test.assertIsDisplayed
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
    fun whenAppStart_thenVerifyComponent1ExistAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component1").assertExists()
        composeTestRule.onNodeWithTag("component1").assertIsDisplayed()
    }

    @Test
    fun whenAppStart_thenVerifyComponent2ExisttAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component2").assertExists()
        composeTestRule.onNodeWithTag("component2").assertIsDisplayed()

    }

    @Test
    fun whenAppStart_thenVerifyComponent3ExisttAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component3").assertExists()
        composeTestRule.onNodeWithTag("component3").assertIsDisplayed()

    }

    @Test
    fun whenAppStart_thenVerifyComponent4ExisttAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component4").assertExists().assertIsDisplayed()
    }

    @Test
    fun whenAppStart_thenVerifyComponent5ExisttAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component5").assertExists().assertIsDisplayed()
    }

    @Test
    fun whenAppStart_thenVerifyComponent6ExisttAndVisible() {
        composeTestRule.setContent {
            BottomLogingScreem()
        }
        composeTestRule.onNodeWithTag("component6").assertExists().assertIsDisplayed()
    }

}

