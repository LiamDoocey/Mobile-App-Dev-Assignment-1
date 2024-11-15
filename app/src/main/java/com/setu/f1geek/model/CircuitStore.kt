package com.setu.f1geek.model

class CircuitStore(val circuits: List<Circuit> = mutableListOf())

fun seedCircuitStore(): CircuitStore{
    val circuits = mutableListOf(
        Circuit(
            "Bahrain International Circuit",
            "Bahrain",
            5.412f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Carlos Sainz", 2024),
                Result("Max Verstappen", "Sergio Perez", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Carlos Sainz", "Lewis Hamilton", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Jeddah Corniche Circuit",
            "Saudi Arabia",
            6.175f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Charles Leclerc", 2024),
                Result("Sergio Perez", "Max Verstappen", "Fernando Alonso", 2023),
                Result("Max Verstappen", "Charles Leclerc", "Carlos Sainz", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Albert Park Circuit",
            "Australia",
            5.303f,
            mutableListOf(
                Result("Carlos Sainz", "Charles Leclerc", "Lando Norris", 2024),
                Result("Max Verstappen", "Lewis Hamilton", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Sergio Perez", "George Russell", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Suzuka Circuit",
            "Japan",
            5.807f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Carlos Sainz", 2024),
                Result("Max Verstappen", "Sergio Perez", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Carlos Sainz", "Lewis Hamilton", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Silverstone Circuit",
            "United Kingdom",
            5.891f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Charles Leclerc", 2024),
                Result("Sergio Perez", "Max Verstappen", "Fernando Alonso", 2023),
                Result("Max Verstappen", "Charles Leclerc", "Carlos Sainz", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Monza Circuit",
            "Italy",
            5.793f,
            mutableListOf(
                Result("Carlos Sainz", "Charles Leclerc", "Lando Norris", 2024),
                Result("Max Verstappen", "Lewis Hamilton", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Sergio Perez", "George Russell", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Sochi Autodrom",
            "Russia",
            5.848f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Carlos Sainz", 2024),
                Result("Max Verstappen", "Sergio Perez", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Carlos Sainz", "Lewis Hamilton", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Circuit de Barcelona-Catalunya",
            "Spain",
            4.675f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Charles Leclerc", 2024),
                Result("Sergio Perez", "Max Verstappen", "Fernando Alonso", 2023),
                Result("Max Verstappen", "Charles Leclerc", "Carlos Sainz", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Circuit de Monaco",
            "Monaco",
            3.337f,
            mutableListOf(
                Result("Carlos Sainz", "Charles Leclerc", "Lando Norris", 2024),
                Result("Max Verstappen", "Lewis Hamilton", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Sergio Perez", "George Russell", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
        Circuit(
            "Circuit Paul Ricard",
            "France",
            5.842f,
            mutableListOf(
                Result("Max Verstappen", "Sergio Perez", "Carlos Sainz", 2024),
                Result("Max Verstappen", "Sergio Perez", "Fernando Alonso", 2023),
                Result("Charles Leclerc", "Carlos Sainz", "Lewis Hamilton", 2022),
                Result("Lewis Hamilton", "Max Verstappen", "Valtteri Bottas", 2021),
            )
        ),
    )
    return CircuitStore(circuits)
}