package com.setu.f1geek.model

class TeamStore (val teams: List<Team> = mutableListOf())

fun seedTeamStore(): TeamStore{
    val teams = mutableListOf(
        Team(
            "McLaren",
            Driver("Lando", "Norris", "NOR", 4),
            Driver("Oscar", "Piastri", "PIA", 81),
            listOf(
                Driver("Ryo", "Hirakawa", "HIR", 8),
                Driver("Pato", "O'Ward", "OWA", 5)
            )
        ),
        Team(
            "Ferrai",
            Driver("Charles", "Leclerc", "LEC", 16),
            Driver("Carlos", "Sainz", "SAI", 55),
            listOf(
                Driver("Olivier", "Bearman", "BEA", 50),
                Driver("Antonio", "Giovinazzi", "GIO", 36),
                Driver("Robert", "Shwartzman", "SHW", 83)
            )
        ),
        Team(
            "Red Bull Racing",
            Driver("Max", "Verstappen", "VER", 1),
            Driver("Sergio", "Perez", "PER", 11),
            listOf(
                Driver("Liam", "Lawson", "LAW", 30),
            )
        ),
        Team(
            "Mercedes",
            Driver("Lewis", "Hamilton", "HAM", 44),
            Driver("George", "Russell", "RUS", 63),
            listOf(
                Driver("Mick", "Schumacher", "MSC", 47),
                Driver("Frederik", "Vesti", "VES", 42)
            )
        ),
        Team(
            "Astorn Martin",
            Driver("Fernando", "Alonso", "ALO", 14),
            Driver("Lance", "Stroll", "STR", 18),
            listOf(
                Driver("Felipe", "Drugovich", "DRU", 34),
            )
        ),
        Team(
            "Apline",
            Driver("Pierre", "Gasly", "GAS", 10),
            Driver("Estebar", "Ocon", "OCO", 31),
            listOf(
                Driver("Jack", "Doohan", "DOO", 12),
            )
        ),
        Team(
            "Haas",
            Driver("Nico", "Hulkenberg", "HUL", 27),
            Driver("Kevin", "Magnussen", "MAG", 20),
            listOf(
                Driver("Pietro", "Fittipaldi", "FIT", 51),
                Driver("Olivier", "Bearman", "BEA", 50)
            )
        ),
        Team(
            "RB",
            Driver("Yuki", "Tsunoda", "TSU", 22),
            Driver("Liam", "Lawson", "LAW", 30),
            listOf()
        ),
        Team(
            "Williams",
            Driver("Alexander", "Albon", "ALB", 23),
            Driver("Franco", "Colapinto", "COL", 43),
            listOf()
        ),
        Team(
            "Kick Sauber",
            Driver("Valtteri", "Bottas", "BOT", 77),
            Driver("Zhou", "Guanyu", "ZHO", 24),
            listOf(
                Driver("Theo", "Pourchaire", "POU", 33),
                Driver("Zane", "Maloney", "MAL", 35)
            )
        )
    )
    return TeamStore(teams)
}