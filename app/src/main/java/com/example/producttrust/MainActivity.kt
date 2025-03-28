package com.example.producttrust

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.ui.tooling.preview.Preview
import com.example.producttrust.screens.DashboardScreen


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          DashboardScreen()
        }
    }
}



