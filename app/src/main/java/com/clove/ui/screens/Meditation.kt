package com.clove.ui.screens

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clove.R

@Composable
fun Meditation(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.meditate_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop

        )

        Column (
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
             ){

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = { TODO() },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.btn)),
                modifier = Modifier
                    .shadow(elevation = 8.dp, shape = MaterialTheme.shapes.medium)
                    .height(50.dp)
                    .width(200.dp)
            ) {
                Text(text = "Set Timer", color = Color.White, fontFamily = FontFamily.SansSerif)
            }

            Spacer(modifier = Modifier.height(500.dp))

            Button(
                onClick = { TODO() },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.btn)),
                modifier = Modifier
                    .shadow(elevation = 8.dp, shape = MaterialTheme.shapes.medium)
                    .height(50.dp)
                    .width(200.dp)
            ) {
                Text(text = "Meditate", color = Color.White, fontFamily = FontFamily.SansSerif)
            }


        }


    }

}

@Preview
@Composable
fun MeditationPreview(){
    Meditation()
}
