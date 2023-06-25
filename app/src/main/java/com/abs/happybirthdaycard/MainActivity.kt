package com.abs.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.abs.happybirthdaycard.ui.theme.HappyBirthdayCardTheme
import androidx.compose.material.MaterialTheme.colors as colors1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colors1.background
                ) {
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = message,
            fontSize = 26.sp
        )
        Text(
            text = from,
            fontSize = 16.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayCardTheme {
        BirthdayGreetingWithText(message = "Happy Birthday to you, Sam!", from = "from Amanda")
    }
}


