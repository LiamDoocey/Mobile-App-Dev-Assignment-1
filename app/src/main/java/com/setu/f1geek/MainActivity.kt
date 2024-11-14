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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.setu.f1geek.model.Driver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import com.setu.f1geek.model.seedDriverStore

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            F1GeekTheme {
                val driverStore = seedDriverStore()
                DriverList(drivers = driverStore.drivers)
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
        drivers.filter { it.fullName.contains(filterText, true) }.forEach { driver ->
            Text("${driver.firstName} ${driver.surName}")
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