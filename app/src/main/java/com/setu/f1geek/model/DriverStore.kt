package com.setu.f1geek.model

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val drivers = mutableListOf(
        Driver("Max", "Verstappen", "VER", 1),
        Driver("Lando", "Norris", "NOR", 4),
        Driver("Charles", "Leclerc", "LEC", 16),
        Driver("Oscar", "Piastri", "PIA", 81),
        Driver("Carlos", "Sainz", "SAI", 55),
        Driver("George", "Russell", "RUS", 63),
        Driver("Lewis", "Hamilton", "HAM", 44),
        Driver("Serigo", "Perez", "PER", 11),
        Driver("Fernando", "Alonso", "ALO", 14),
        Driver("Nico", "Hulkenberg", "HUL", 27),
        Driver("Yuki", "Tsunoda", "TSU", 22),
        Driver("Pierre", "Gasly", "GAS", 10),
        Driver("Lance", "Stroll", "STR", 18),
        Driver("Esteban", "Ocon", "OCO", 31),
        Driver("Kevin", "Magnussen", "MAG", 20),
        Driver("Alexander", "Albon", "ALB", 23),
        Driver("Daniel", "Ricciardo", "RIC", 3),
        Driver("Oliver", "Bearman", "BEA", 50),
        Driver("Franco", "Colapinto", "COL", 43),
        Driver("Liam", "Lawson", "LAW", 30),
        Driver("Zhou", "Guanyu", "ZHO", 24),
        Driver("Logan", "Sargeant", "SAR", 2),
        Driver("Valtteri", "Bottas", "BOT", 77),
    )
    return DriverStore(drivers)
}