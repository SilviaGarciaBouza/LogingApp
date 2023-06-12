package com.example.loggingapp.UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.rounded.Close
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.RoundedCornerShape
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LogingSacreem() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(22.dp)) {
        UpLogingScreem()
        Spacer(modifier = Modifier.size(50.dp))

        BodyLogingScreem()
        Spacer(modifier = Modifier.size(20.dp))

        BottomLogingScreem()
        Spacer(modifier = Modifier.size(10.dp))
    }
}




@Composable
fun UpLogingScreem() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
        Icon(imageVector = Icons.Rounded.Close, contentDescription = "Icon", tint = Color.Black)
    }
}

@Composable
fun BodyLogingScreem(){
    var myTextEmail by rememberSaveable { mutableStateOf("") }
    var myTextPassport by rememberSaveable { mutableStateOf("") }


    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        Image(
            painter = painterResource(id = com.example.loggingapp.R.drawable.perro),
            contentDescription = "dog image",
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(45f))
        )

        Spacer(modifier = Modifier.size(26.dp))

        OutlinedTextField(value = myTextEmail, onValueChange = { myTextEmail = it }, label = { Text(
            text = "Email"
        )})

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(value = myTextPassport, onValueChange = { myTextPassport = it }, label = { Text(
            text = "Password"
        )})

        Spacer(modifier = Modifier.size(8.dp))


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp), horizontalAlignment = Alignment.End) {

            Text(text = "Forgot password?", color = Color.Gray, fontSize = 10.sp)
        }

        Spacer(modifier = Modifier.size(26.dp))

        Button(onClick = { /*TODO*/ }, enabled = false) {
            Text(text = "Log in", modifier = Modifier.padding(horizontal = 32.dp))
        }
    }
}

@Composable
fun BottomLogingScreem() {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

        Divider(
            Modifier
                .fillMaxWidth()
                .padding(12.dp), color = Color.LightGray
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Continue as NAME NAME", color = Color.Gray, fontSize = 14.sp)
        Spacer(modifier = Modifier.size(16.dp))

        Divider(
            Modifier
                .fillMaxWidth()
                .padding(12.dp), color = Color.LightGray
        )
        Row() {
            Text(text ="Don't have a account?", color = Color.Gray, fontSize = 14.sp)
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Sign Up", color = Color.Blue, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
    }
}