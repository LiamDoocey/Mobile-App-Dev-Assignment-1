package com.setu.f1geek.model

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val drivers = mutableListOf(
        Driver("Max", "Verstappen", "VER", 1, 27),
        Driver("Lando", "Norris", "NOR", 4, 25),
        Driver("Charles", "Leclerc", "LEC", 16, 27),
        Driver("Oscar", "Piastri", "PIA", 81, 23),
        Driver("Carlos", "Sainz", "SAI", 55, 30),
        Driver("George", "Russell", "RUS", 63, 26),
        Driver("Lewis", "Hamilton", "HAM", 44, 39),
        Driver("Serigo", "Perez", "PER", 11, 34),
        Driver("Fernando", "Alonso", "ALO", 14, 43),
        Driver("Nico", "Hulkenberg", "HUL", 27, 37),
        Driver("Yuki", "Tsunoda", "TSU", 22, 24),
        Driver("Pierre", "Gasly", "GAS", 10, 28),
        Driver("Lance", "Stroll", "STR", 18, 26),
        Driver("Esteban", "Ocon", "OCO", 31, 28),
        Driver("Kevin", "Magnussen", "MAG", 20, 32),
        Driver("Alexander", "Albon", "ALB", 23, 28),
        Driver("Daniel", "Ricciardo", "RIC", 3, 35),
        Driver("Oliver", "Bearman", "BEA", 50, 19),
        Driver("Franco", "Colapinto", "COL", 43, 21),
        Driver("Liam", "Lawson", "LAW", 30, 22),
        Driver("Zhou", "Guanyu", "ZHO", 24, 25),
        Driver("Logan", "Sargeant", "SAR", 2, 23),
        Driver("Valtteri", "Bottas", "BOT", 77, 35),
    )
    return DriverStore(drivers)
}