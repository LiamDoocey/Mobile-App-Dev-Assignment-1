package com.setu.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.setu.f1geek.ui.theme.F1GeekTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import com.setu.f1geek.model.Driver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.setu.f1geek.model.DriverStore
import com.setu.f1geek.model.Team
import com.setu.f1geek.model.TeamStore
import com.setu.f1geek.model.seedDriverStore
import com.setu.f1geek.model.seedTeamStore

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        var selectedTeam: Team? = null
        setContent {
            F1GeekTheme {
                val teamStore = seedTeamStore()
                var currentScreen by rememberSaveable() { mutableStateOf("home") }
                val onTeamClick = { team: Team ->
                    println("Selected team: ${team.name}")
                    selectedTeam = team
                    currentScreen = "Drivers"
                }
                println("Current screen: $currentScreen")

                if (currentScreen === "Drivers"){
                    //If teams drivers are null then return empty list
                    val filteredDrivers = selectedTeam?.let { team ->
                        listOf(team.primaryDriver, team.secondaryDriver) + team.reserveDrivers
                    } ?: emptyList()
                    DriverList(
                        drivers = filteredDrivers,
                        { currentScreen = "home" }
                    )
                } else {
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
fun DriverList(drivers: List<Driver>, onClickHandler: () -> Unit, modifier: Modifier = Modifier) {

    var filterText by rememberSaveable() { mutableStateOf("") }

    Column {
        Button(onClick = { onClickHandler()}, modifier = modifier){
            Text("Back")
        }
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

@Composable
fun TeamList(teams: List<Team>, onClickHandler: (Team) -> Unit, modifier: Modifier = Modifier) {
    Column {
        teams.forEachIndexed { index, team ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            Text(
                text = team.name,
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .padding(31.dp)
                    .clickable { onClickHandler(team) }
            )
        }
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