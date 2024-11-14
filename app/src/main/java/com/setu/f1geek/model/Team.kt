package com.setu.f1geek.model

class Team (
    val name: String,
    val primaryDriver: Driver,
    val secondaryDriver: Driver,
    val reserveDrivers: List<Driver>
) {
    init {
        if (primaryDriver.number == secondaryDriver.number) {
            throw IllegalStateException("Primary and secondary drivers are the same")
        }
    }
}