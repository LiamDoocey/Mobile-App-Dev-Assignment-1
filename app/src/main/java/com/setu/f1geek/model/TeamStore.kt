package com.setu.f1geek.model

import com.setu.f1geek.R
import kotlin.math.log

class TeamStore (val teams: List<Team> = mutableListOf())

fun seedTeamStore(): TeamStore{
    val teams = mutableListOf(
        Team(
            "McLaren",
            Driver("Lando", "Norris", "NOR", 4, 25, R.drawable.lando_norris_head, R.drawable.lando_norris),
            Driver("Oscar", "Piastri", "PIA", 81, 23, R.drawable.oscar_piastri_head, R.drawable.oscar_piastri),
            listOf(
                Driver("Ryo", "Hirakawa", "HIR", 8, 30),
                Driver("Pato", "O'Ward", "OWA", 5, 25)
            ),
            logo = R.drawable.mclaren
        ),
        Team(
            "Ferrai",
            Driver("Charles", "Leclerc", "LEC", 16, 27, R.drawable.charles_leclerc_head, R.drawable.charles_leclerc),
            Driver("Carlos", "Sainz", "SAI", 55, 30, R.drawable.carlos_sainz_head, R.drawable.carlos_sainz),
            listOf(
                Driver("Olivier", "Bearman", "BEA", 50, 19),
                Driver("Antonio", "Giovinazzi", "GIO", 36,30),
                Driver("Robert", "Shwartzman", "SHW", 83, 25)
            ),
            logo = R.drawable.ferrari
        ),
        Team(
            "Red Bull Racing",
            Driver("Max", "Verstappen", "VER", 1, 27, R.drawable.max_verstappen_head, R.drawable.max_verstappen),
            Driver("Sergio", "Perez", "PER", 11, 34, R.drawable.sergio_perez_head, R.drawable.sergio_perez),
            listOf(
                Driver("Liam", "Lawson", "LAW", 30, 22, R.drawable.liam_lawson_head, R.drawable.liam_lawson),
            ),
            logo = R.drawable.redbull
        ),
        Team(
            "Mercedes",
            Driver("Lewis", "Hamilton", "HAM", 44, 39, R.drawable.lewis_hamilton_head, R.drawable.lewis_hamilton),
            Driver("George", "Russell", "RUS", 63, 26, R.drawable.george_russell_head, R.drawable.george_russell),
            listOf(
                Driver("Mick", "Schumacher", "MSC", 47, 25),
                Driver("Frederik", "Vesti", "VES", 42, 22)
            ),
            logo = R.drawable.mercedes
        ),
        Team(
            "Aston Martin",
            Driver("Fernando", "Alonso", "ALO", 14, 43, R.drawable.fernando_alonso_head,  R.drawable.fernando_alonso),
            Driver("Lance", "Stroll", "STR", 18, 26, R.drawable.lance_stroll_head, R.drawable.lance_stroll),
            listOf(
                Driver("Felipe", "Drugovich", "DRU", 34, 24),
            ),
            logo = R.drawable.astonmartin
        ),
        Team(
            "Apline",
            Driver("Pierre", "Gasly", "GAS", 10, 28, R.drawable.pierre_gasly_head, R.drawable.pierre_gasly),
            Driver("Estebar", "Ocon", "OCO", 31, 28, R.drawable.esteban_ocon_head, R.drawable.esteban_ocon),
            listOf(
                Driver("Jack", "Doohan", "DOO", 12, 21),
            ),
            logo = R.drawable.alpine
        ),
        Team(
            "Haas",
            Driver("Nico", "Hulkenberg", "HUL", 27, 37, R.drawable.nico_hulkenberg_head, R.drawable.nico_hulkenberg),
            Driver("Kevin", "Magnussen", "MAG", 20, 32, R.drawable.kevin_magnussen_head, R.drawable.kevin_magnussen),
            listOf(
                Driver("Pietro", "Fittipaldi", "FIT", 51, 28),
                Driver("Olivier", "Bearman", "BEA", 50, 19)
            ),
            logo = R.drawable.haas
        ),
        Team(
            "RB",
            Driver("Yuki", "Tsunoda", "TSU", 22, 24, R.drawable.yuki_tsunoda_head, R.drawable.yuki_tsunoda),
            Driver("Liam", "Lawson", "LAW", 30, 22, R.drawable.liam_lawson_head, R.drawable.liam_lawson),
            listOf(),
            logo = R.drawable.rb
        ),
        Team(
            "Williams",
            Driver("Alexander", "Albon", "ALB", 23, 28, R.drawable.alexander_albon_head, R.drawable.alexander_albon),
            Driver("Franco", "Colapinto", "COL", 43, 21, R.drawable.franco_colapinto_head, R.drawable.franco_colapinto),
            listOf(),
            logo = R.drawable.williams
        ),
        Team(
            "Kick Sauber",
            Driver("Valtteri", "Bottas", "BOT", 77, 35, R.drawable.valtteri_bottas_head, R.drawable.valtteri_bottas),
            Driver("Zhou", "Guanyu", "ZHO", 24, 25, R.drawable.zhou_guanya_head, R.drawable.zhou_guanya),
            listOf(
                Driver("Theo", "Pourchaire", "POU", 33, 21),
                Driver("Zane", "Maloney", "MAL", 35, 21)
            ),
            logo = R.drawable.kicksauber
        )
    )
    return TeamStore(teams)
}