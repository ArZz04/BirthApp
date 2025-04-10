package com.arzz.birthapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.arzz.birthapp.ui.theme.BirthAppTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthAppTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "LA FORTALEZA DEL HOMBRE, RADICA EN EL DOMINIO DE SU MENTE!",
                        from = "JUAN ARVIZU",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from: String, modifier: Modifier  = Modifier ) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF5E2CA7)) // Color morado fijo
            .padding(16.dp)
    ) {
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 65.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
            color = Color.White,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthAppTheme {
        GreetingText(message = "Feliz Cumpleaños!", from = "ArZz")
    }
}