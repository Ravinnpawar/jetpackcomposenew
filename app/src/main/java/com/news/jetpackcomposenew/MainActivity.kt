package com.news.jetpackcomposenew

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*MaterialTheme {

            }*/
            App()
        }
    }

    @Composable
    private fun App() {
        val click = ClickCount()
        Column {
            TopAppBar(
                title = { Text(text = "Pets Show", color = Color.White) },
                backgroundColor = Color.Blue
            )
            Text(text = "Hey Ravindra")
            Text(text = "How are you?")
            val context = LocalContext.current
            OutlinedButton(
                onClick = {
                    click.count++
                    Toast.makeText(context, "Hello Toast Showing message", Toast.LENGTH_LONG).show();
                    context.startActivity(Intent(context, SecondActivity::class.java))
                },

                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.padding(1.dp),
                border = BorderStroke(1.dp, Color.Red),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = Color.Blue
                ),
            ) {
                Image(
                    painterResource(id = R.drawable.ic_cart),
                    contentDescription = "Cart button icon",
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "Click ${click.count}",color=Color.White,
                    modifier = Modifier.padding(1.dp))

            }
        }

    }

    @Preview
    @Composable
    private fun displayPreview() {
        MaterialTheme {
            App()
        }
    }

    class ClickCount(var count: Int = 0) {

    }
}
