package com.setu.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.setu.f1geek.ui.theme.F1GeekTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import com.setu.f1geek.model.Driver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalModifierNode
import androidx.compose.ui.unit.dp
import com.setu.f1geek.model.Team
import com.setu.f1geek.model.seedTeamStore

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        var selectedTeam: Team? = null
        var selectedDriver: Driver? = null
        setContent {
            F1GeekTheme {
                val teamStore = seedTeamStore()
                var currentScreen by rememberSaveable() { mutableStateOf("home") }

                val onTeamClick = { team: Team ->
                    println("Selected team: ${team.name}")
                    selectedTeam = team
                    currentScreen = "Drivers"
                }

                val onDriverClick = { driver: Driver ->
                    println("Selected driver: ${driver.fullName}")
                    selectedDriver = driver
                    currentScreen = "driverInfo"
                }

                println("Current screen: $currentScreen")

                if (currentScreen === "Drivers"){
                    //If teams drivers are null then return empty list
                    val filteredDrivers = selectedTeam?.let { team ->
                        listOf(team.primaryDriver, team.secondaryDriver) + team.reserveDrivers
                    } ?: emptyList()
                    DriverList(
                        drivers = filteredDrivers,
                        onDriverClick = onDriverClick,
                        { currentScreen = "home" }
                    )
                }

                else if (currentScreen === "driverInfo") {
                    selectedDriver?.let { driver ->
                        driverInfo(
                            driver,
                            onClickHandler = { currentScreen = "Drivers" }
                        )
                    }
                }

                else {
                    TeamList(
                        teamStore.teams,
                        onTeamClick
                    )
                }
            }
        }
    }
}

@Composable
fun DriverList(drivers: List<Driver>, onDriverClick: (Driver) -> Unit, onClickHandler: () -> Unit, modifier: Modifier = Modifier) {

    var filterText by rememberSaveable() { mutableStateOf("") }

    Column {
        Button(onClick = { onClickHandler()}, modifier = modifier){
            Text("Back to teams")
        }
        TextField(value = filterText, onValueChange = { value -> filterText = value }, label = { Text("Search") })
        drivers.filter { it.fullName.contains(filterText, true) }.forEachIndexed { index, driver ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            Text(
                text = driver.fullName,
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .padding(28.dp)
                    .clickable { onDriverClick(driver) }
            )
        }
    }
}

@Composable
fun TeamList(teams: List<Team>, onClickHandler: (Team) -> Unit, modifier: Modifier = Modifier) {
    var filterText by rememberSaveable() { mutableStateOf("") }

    Column {
        TextField(value = filterText, onValueChange = { value -> filterText = value }, label = { Text("Search") })
        teams.filter { it.name.contains(filterText, true) }.forEachIndexed { index, team ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            Text(
                text = team.name,
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .padding(28.dp)
                    .clickable { onClickHandler(team) }
            )
        }
    }
}

@Composable
fun driverInfo(driver: Driver, onClickHandler: () -> Unit, modifier: Modifier = Modifier) {
    Column {
        Button(onClick = { onClickHandler() }) {
            Text("Back to Drivers")
        }
        Text("Name: ${driver.fullName}")
        Text("Abbreviated Name: ${driver.abbreviatedName}")
        Text("Car Number: ${driver.number}")
        Text("Age: ${driver.age}")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    F1GeekTheme {
//        val driverStore = seedDriverStore()
//        DriverList(drivers = driverStore.drivers)
//    }
//}