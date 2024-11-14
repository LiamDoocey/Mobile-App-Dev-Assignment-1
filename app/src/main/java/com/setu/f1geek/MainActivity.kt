package com.setu.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.setu.f1geek.ui.theme.F1GeekTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import com.setu.f1geek.model.Driver

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            F1GeekTheme {
                DriverList()
            }
        }
    }
}

@Composable
fun DriverList(modifier: Modifier = Modifier) {

    val drivers = listOf(
            Driver("Roland", "Ratzenberger", "RAT", 32),
            Driver("Jochen", "Rindt", "RIN", 22),
            Driver("Jules", "Bianchi", "BIA", 17),
    )

    Column(modifier = modifier) {
        TextField(value = "", onValueChange = {}, label = { Text("Search") })
        drivers.forEach { driver ->
            Text(text = "${driver.firstName} ${driver.surName} (${driver.number})")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    F1GeekTheme {
        DriverList()
    }
}