package com.example.meditationapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePicture(
    imageResource: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = "Profile Picture",
        modifier = modifier
            .size(50.dp) // Adjust size as needed
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}
