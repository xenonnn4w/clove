package com.clove.ui.screens

import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clove.R
import com.clove.ui.theme.CloveTheme


@Composable
fun UserNameScreen() {
    var text by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.usernamescreen_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 1.0f // 100% opacity
        )

        // Add other UI elements on top of the background image
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "What should we call you?",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontFamily = JaldiFontFamily, // Replace with JaldiFontFamily if defined
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp) // Add padding here
            )
            Spacer(modifier = Modifier.height(150.dp)) // Add spacing between text and text field

            Column {
                BasicTextField(
                    value = text,
                    onValueChange = {
                        text = it
                    },
                    singleLine = true,
                    textStyle = TextStyle(
                        fontFamily = JaldiFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                        color = Color.White),
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .height(70.dp)
                        .width(250.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(2.dp)
                        .align(Alignment.CenterHorizontally)
                        .background(Color.White) // Add an underline
                )
            }


            Spacer(modifier = Modifier.height(100.dp)) // Adjust spacing below text field

            Button(
                onClick = { /* TODO: Add your click handling logic */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.btn) // Button background color
                ),
                modifier = Modifier
                    .shadow(elevation = 8.dp, shape = MaterialTheme.shapes.medium) // Add shadow
                    .height(50.dp) // Set the button height
                    .width(200.dp) // Set the button width
            ) {
                Text(
                    text = "Continue",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 18.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun UserNameScreenPreview() {
    CloveTheme {
        UserNameScreen()
    }
}
