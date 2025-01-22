package com.clove.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clove.R
import com.clove.ui.component.Sleep_Sound_button1
import com.clove.ui.component.Sleep_Sound_button2
import com.clove.ui.component.Sleep_Sound_button3
import com.clove.ui.component.Sleep_Sound_button4


@Composable
fun SleepSoundMain() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.sleepsound),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Column to stack the Boxes vertically
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            // First Box
            Box(
                modifier = Modifier
                    .weight(1f) // Equal space proportion
                    .fillMaxWidth()
            ) {
                Text(
                    text = "What Sleep Sound would you like to listen?",
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontFamily = JaldiFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                        color = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth().padding(12.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(3f) // 2nd box takes more vertical space relative to others
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 50.dp) // Add padding below the first row
                    ) {
                        Sleep_Sound_button1()
                        Spacer(modifier = Modifier.width(10.dp))
                        Sleep_Sound_button2()
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Sleep_Sound_button3()
                        Spacer(modifier = Modifier.width(12.dp))
                        Sleep_Sound_button4()
                    }
                }

            }

        }
    }
}





@Preview
@Composable
fun SleepSoundMainPreview(){
    SleepSoundMain()
}