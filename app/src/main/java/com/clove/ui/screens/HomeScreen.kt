package com.clove.ui.screens

import ClickablePngIcon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clove.R

import com.example.meditationapp.ui.components.ProfilePicture

@Composable
fun HomeScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.homescreen_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart), // Align to the top-left corner
            verticalArrangement = Arrangement.spacedBy(16.dp) // Space between rows
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Space items evenly
            ){
                ProfilePicture(imageResource = R.drawable.profile_pic)
                IconScreen()
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Space items evenly
            ){
                Column(
                    verticalArrangement = Arrangement.spacedBy(0.dp)
                ){
                    Text(
                        text = "Good Morning",
                        fontFamily = FontFamily.SansSerif, // Use your specific font family here
                        fontWeight = FontWeight.Light,
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier.padding(0.dp)
                    )

                    Text(
                        text = "REYNA",
                        fontFamily = FontFamily.SansSerif, // Use your specific font family here
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White,
                        modifier = Modifier.padding(0.dp)
                    )
                }

                // Card for the timer box
                Box(
                    modifier = Modifier
                        .width(200.dp) // Set the fixed width for the timer box
                        .padding(16.dp) // Optional padding for spacing
                        .background(
                            color = colorResource(id = R.color.reminder_background_color), // Use custom color from colors.xml
                            shape = RoundedCornerShape(16.dp) // Set background with rounded corners
                        )
                        .padding(0.dp) // Padding around the text inside the Box
                        .height(70.dp), // Allow height to adjust to content size
                    contentAlignment = Alignment.Center // Align the text in the center
                    ) {
                    Column(
                        modifier = Modifier.padding(0.dp) // Optional inner padding for text
                    ) {
                        Text(
                            text = "Meditation Starts in :",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black // Text color
                            )
                        )
                        Text(
                            text = "10 PM",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray // Text color
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

@Composable
fun IconScreen() {
    ClickablePngIcon(
        iconResource = R.drawable.ic_add, // Replace with your PNG resource
        contentDescription = "My PNG Icon",
        onClick = {
            // Perform your action here
            println("PNG Icon clicked!")
        }
    )
}
