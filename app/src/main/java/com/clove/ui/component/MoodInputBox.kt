package com.clove.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoodInputBox() {
    // State to hold user input
    val userInput = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(0.dp)) {

        // User Input Field
        OutlinedTextField(
            value = userInput.value,
            onValueChange = { userInput.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = RoundedCornerShape(40.dp), // Rounded corners
            placeholder = {
                Text(
                    text = "What's on your mind today?",
                    style = TextStyle(
                        textAlign = TextAlign.Center, // Center-align placeholder text
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                )
            },
            maxLines = 3 // Optional: Limit the number of lines
        )
    }
}

@Preview
@Composable
fun MoodInputBoxPreview() {
    MoodInputBox()
}
