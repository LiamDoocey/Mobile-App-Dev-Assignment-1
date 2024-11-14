package com.setu.f1geek.model

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val drivers = mutableListOf(
        Driver("Lewis", "Hamilton", "HAM", 44),
        Driver("Valtteri", "Bottas", "BOT", 77),
        Driver("Max", "Verstappen", "VER", 33),
        Driver("Sergio", "Perez", "PER", 11),
        Driver("Daniel", "Ricciardo", "RIC", 3),
        Driver("Lando", "Norris", "NOR", 4),
        Driver("Charles", "Leclerc", "LEC", 16),
        Driver("Carlos", "Sainz", "SAI", 55),
        Driver("Sebastian", "Vettel", "VET", 5),
        Driver("Lance", "Stroll", "STR", 18),
        Driver("Fernando", "Alonso", "ALO", 14),
        Driver("Esteban", "Ocon", "OCO", 31),
        Driver("Pierre", "Gasly", "GAS", 10),
        Driver("Yuki", "Tsunoda", "TSU", 22),
        Driver("Kimi", "Raikkonen", "RAI", 7),
        Driver("Antonio", "Giovinazzi", "GIO", 99),
        Driver("Mick", "Schumacher", "MSC", 47),
        Driver("Nikita", "Mazepin", "MAZ", 9),
        Driver("George", "Russell", "RUS", 63),
        Driver("Nicholas", "Latifi", "LAT", 6)
    )
    return DriverStore(drivers)
}