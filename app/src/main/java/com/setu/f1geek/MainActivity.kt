package com.setu.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.setu.f1geek.ui.theme.F1GeekTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import com.setu.f1geek.model.Driver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        DriverInfo(
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
        TextField(
            modifier = modifier
                .fillMaxWidth(),
            value = filterText,
            onValueChange = { value -> filterText = value },
            label = { Text("Search") }
        )
        drivers.filter { it.fullName.contains(filterText, true) }.forEachIndexed { index, driver ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .clickable { onDriverClick(driver) }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = driver.fullName,
                    modifier = Modifier.weight(1f)
                )
                Image(
                    painter = painterResource(driver.headshot ?: R.drawable.default_avatar),
                    contentDescription = "Driver headshot",
                    modifier = Modifier
                        .size(64.dp)
                )
            }
        }
    }
}

@Composable
fun TeamList(teams: List<Team>, onClickHandler: (Team) -> Unit, modifier: Modifier = Modifier) {
    var filterText by rememberSaveable() { mutableStateOf("") }

    Column {
        TextField(
            modifier = modifier
                .fillMaxWidth(),
            value = filterText,
            onValueChange = { value -> filterText = value },
            label = { Text("Search") }
        )
        teams.filter { it.name.contains(filterText, true) }.forEachIndexed { index, team ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.Transparent
            //https://www.mal7othify.com/post/compose_lists/
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .clickable { onClickHandler(team) }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = team.name,
                    modifier = Modifier.weight(1f)
                )
                //https://developer.android.com/develop/ui/compose/resources
                Image(
                    painter = painterResource(team.logo),
                    contentDescription = "Team logo",
                    modifier = Modifier
                        .size(64.dp)
                )
            }
        }
    }
}

@Composable
fun DriverInfo(driver: Driver, onClickHandler: () -> Unit, modifier: Modifier = Modifier) {
    Column {
        Button(onClick = { onClickHandler() }) {
            Text("Back to Drivers")
        }
        Text(
            driver.fullName,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(4.dp),
            textDecoration =
                            TextDecoration.Underline,
                            fontSize = 24.sp,
                            fontWeight = Bold
        )
        Image(
            painter = painterResource(driver.profileImage ?: R.drawable.default_avatar),
            contentDescription = "Driver profile image",
            modifier = modifier
                .size(320.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            "Abbreviated Name: ${driver.abbreviatedName}",
            modifier = modifier.padding(4.dp)
        )
        Text(
            "Car Number: ${driver.number}",
            modifier = modifier.padding(4.dp)
        )
        Text(
            "Age: ${driver.age}",
            modifier = modifier
                .padding(4.dp)
                .fillMaxWidth()
        )
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