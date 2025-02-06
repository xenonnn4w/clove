package com.clove

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.clove.navigation.AppWithBottomNavigation
import com.clove.ui.theme.CloveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CloveTheme {
                AppWithBottomNavigation() // Use the NavigationSetup composable for navigation
            }
        }
    }
}
