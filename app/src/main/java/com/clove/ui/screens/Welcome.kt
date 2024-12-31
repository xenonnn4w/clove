package com.clove.ui.screens

import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.clove.R


val JaldiFontFamily = FontFamily(
    Font(R.font.jaldi_regular, FontWeight.Normal),
    Font(R.font.jaldi_bold, FontWeight.Bold)
)

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.welcome_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hey! Welcome to Clove",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontFamily = JaldiFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(600.dp))
            Button(
                onClick = { navController.navigate("username") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.btn)
                ),
                modifier = Modifier
                    .shadow(elevation = 8.dp, shape = MaterialTheme.shapes.medium)
                    .height(50.dp)
                    .width(200.dp)
            ) {
                Text(text = "Get Started", color = Color.White, fontFamily = FontFamily.SansSerif)
            }
        }
    }
}
