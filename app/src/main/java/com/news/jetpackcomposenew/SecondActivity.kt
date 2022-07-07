package com.news.jetpackcomposenew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            MainContent()
        }
    }

    @Composable
    private fun MainContent() {
        Scaffold(topBar = {
            TopAppBar(title = {
                Text(
                    "PrAndroid | Second Activity",
                    color = Color.White
                )
            }, backgroundColor = Color(0xff0f9d58))
        },content = {})
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    @Preview
    @Composable
    private fun displayPreview(){
        MainContent()
    }
}
