package com.setu.f1geek.model

import com.setu.f1geek.R
import kotlin.math.log

class TeamStore (val teams: List<Team> = mutableListOf())

fun seedTeamStore(): TeamStore{
    val teams = mutableListOf(
        Team(
            "McLaren",
            Driver("Lando", "Norris", "NOR", 4, 25),
            Driver("Oscar", "Piastri", "PIA", 81, 23),
            listOf(
                Driver("Ryo", "Hirakawa", "HIR", 8, 30),
                Driver("Pato", "O'Ward", "OWA", 5, 25)
            ),
            logo = R.drawable.mclaren
        ),
        Team(
            "Ferrai",
            Driver("Charles", "Leclerc", "LEC", 16, 27),
            Driver("Carlos", "Sainz", "SAI", 55, 30),
            listOf(
                Driver("Olivier", "Bearman", "BEA", 50, 19),
                Driver("Antonio", "Giovinazzi", "GIO", 36,30),
                Driver("Robert", "Shwartzman", "SHW", 83, 25)
            ),
            logo = R.drawable.ferrari
        ),
        Team(
            "Red Bull Racing",
            Driver("Max", "Verstappen", "VER", 1, 27),
            Driver("Sergio", "Perez", "PER", 11, 34),
            listOf(
                Driver("Liam", "Lawson", "LAW", 30, 22),
            ),
            logo = R.drawable.redbull
        ),
        Team(
            "Mercedes",
            Driver("Lewis", "Hamilton", "HAM", 44, 39),
            Driver("George", "Russell", "RUS", 63, 26),
            listOf(
                Driver("Mick", "Schumacher", "MSC", 47, 25),
                Driver("Frederik", "Vesti", "VES", 42, 22)
            ),
            logo = R.drawable.mercedes
        ),
        Team(
            "Aston Martin",
            Driver("Fernando", "Alonso", "ALO", 14, 43),
            Driver("Lance", "Stroll", "STR", 18, 26),
            listOf(
                Driver("Felipe", "Drugovich", "DRU", 34, 24),
            ),
            logo = R.drawable.astonmartin
        ),
        Team(
            "Apline",
            Driver("Pierre", "Gasly", "GAS", 10, 28),
            Driver("Estebar", "Ocon", "OCO", 31, 28),
            listOf(
                Driver("Jack", "Doohan", "DOO", 12, 21),
            ),
            logo = R.drawable.alpine
        ),
        Team(
            "Haas",
            Driver("Nico", "Hulkenberg", "HUL", 27, 37),
            Driver("Kevin", "Magnussen", "MAG", 20, 32),
            listOf(
                Driver("Pietro", "Fittipaldi", "FIT", 51, 28),
                Driver("Olivier", "Bearman", "BEA", 50, 19)
            ),
            logo = R.drawable.haas
        ),
        Team(
            "RB",
            Driver("Yuki", "Tsunoda", "TSU", 22, 24),
            Driver("Liam", "Lawson", "LAW", 30, 22),
            listOf(),
            logo = R.drawable.rb
        ),
        Team(
            "Williams",
            Driver("Alexander", "Albon", "ALB", 23, 28),
            Driver("Franco", "Colapinto", "COL", 43, 21),
            listOf(),
            logo = R.drawable.williams
        ),
        Team(
            "Kick Sauber",
            Driver("Valtteri", "Bottas", "BOT", 77, 35),
            Driver("Zhou", "Guanyu", "ZHO", 24, 25),
            listOf(
                Driver("Theo", "Pourchaire", "POU", 33, 21),
                Driver("Zane", "Maloney", "MAL", 35, 21)
            ),
            logo = R.drawable.kicksauber
        )
    )
    return TeamStore(teams)
}