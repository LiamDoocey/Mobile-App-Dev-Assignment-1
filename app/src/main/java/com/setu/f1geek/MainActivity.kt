package com.setu.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.setu.f1geek.ui.theme.F1GeekTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.setu.f1geek.model.Driver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.setu.f1geek.model.seedDriverStore

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            F1GeekTheme {
                val driverStore = seedDriverStore()

                DriverList(
                    drivers = driverStore.drivers, Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                )
            }
        }
    }
}

@Composable
fun DriverList(drivers: List<Driver>, modifier: Modifier = Modifier) {

//    val drivers = listOf(
//            Driver("Roland", "Ratzenberger", "RAT", 32),
//            Driver("Jochen", "Rindt", "RIN", 22),
//            Driver("Jules", "Bianchi", "BIA", 17),
//    )

    var filterText by rememberSaveable() { mutableStateOf("") }
    println("Hello, i'm rescomposing")

    Column {
        TextField(value = filterText, onValueChange = { value -> filterText = value }, label = { Text("Search") })
        drivers.filter { it.fullName.contains(filterText, true) }.forEachIndexed { index, driver ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            Text(
                text = driver.fullName,
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    F1GeekTheme {
        val driverStore = seedDriverStore()
        DriverList(drivers = driverStore.drivers)
    }
}