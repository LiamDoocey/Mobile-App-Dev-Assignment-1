package com.setu.f1geek.model

import com.setu.f1geek.R

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val drivers = mutableListOf(
        Driver("Max", "Verstappen", "VER", 1, 27, R.drawable.max_verstappen_head, R.drawable.max_verstappen),
        Driver("Lando", "Norris", "NOR", 4, 25, R.drawable.lando_norris_head, R.drawable.lando_norris),
        Driver("Charles", "Leclerc", "LEC", 16, 27, R.drawable.charles_leclerc_head, R.drawable.charles_leclerc),
        Driver("Oscar", "Piastri", "PIA", 81, 23, R.drawable.oscar_piastri_head, R.drawable.oscar_piastri),
        Driver("Carlos", "Sainz", "SAI", 55, 30, R.drawable.carlos_sainz_head, R.drawable.carlos_sainz),
        Driver("George", "Russell", "RUS", 63, 26, R.drawable.george_russell_head, R.drawable.george_russell),
        Driver("Lewis", "Hamilton", "HAM", 44, 39, R.drawable.lewis_hamilton_head, R.drawable.lewis_hamilton),
        Driver("Serigo", "Perez", "PER", 11, 34, R.drawable.sergio_perez_head, R.drawable.sergio_perez),
        Driver("Fernando", "Alonso", "ALO", 14, 43, R.drawable.fernando_alonso_head, R.drawable.fernando_alonso),
        Driver("Nico", "Hulkenberg", "HUL", 27, 37, R.drawable.nico_hulkenberg_head, R.drawable.nico_hulkenberg),
        Driver("Yuki", "Tsunoda", "TSU", 22, 24, R.drawable.yuki_tsunoda_head, R.drawable.yuki_tsunoda),
        Driver("Pierre", "Gasly", "GAS", 10, 28, R.drawable.pierre_gasly_head, R.drawable.pierre_gasly),
        Driver("Lance", "Stroll", "STR", 18, 26, R.drawable.lance_stroll_head, R.drawable.lance_stroll),
        Driver("Esteban", "Ocon", "OCO", 31, 28, R.drawable.esteban_ocon_head, R.drawable.esteban_ocon),
        Driver("Kevin", "Magnussen", "MAG", 20, 32, R.drawable.kevin_magnussen_head, R.drawable.kevin_magnussen),
        Driver("Alexander", "Albon", "ALB", 23, 28, R.drawable.alexander_albon_head, R.drawable.alexander_albon),
        Driver("Daniel", "Ricciardo", "RIC", 3, 35, R.drawable.daniel_ricciardo_head, R.drawable.daniel_ricciardo),
        Driver("Oliver", "Bearman", "BEA", 50, 19, R.drawable.oliver_bearman_head, R.drawable.oliver_bearman),
        Driver("Franco", "Colapinto", "COL", 43, 21, R.drawable.franco_colapinto_head, R.drawable.franco_colapinto),
        Driver("Liam", "Lawson", "LAW", 30, 22, R.drawable.liam_lawson_head, R.drawable.liam_lawson),
        Driver("Zhou", "Guanyu", "ZHO", 24, 25, R.drawable.zhou_guanya_head, R.drawable.zhou_guanya),
        Driver("Logan", "Sargeant", "SAR", 2, 23, R.drawable.logan_sargeant_head, R.drawable.logan_sargeant),
        Driver("Valtteri", "Bottas", "BOT", 77, 35, R.drawable.valtteri_bottas_head, R.drawable.valtteri_bottas),
    )
    return DriverStore(drivers)
}