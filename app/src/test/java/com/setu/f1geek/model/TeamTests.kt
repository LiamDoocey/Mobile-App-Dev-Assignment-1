package com.setu.f1geek.model

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TeamTests {

    @Test
    fun getName() {
        val charles = Driver("Charles", "Leclerc", "CL", 16, 23)
        val carlos = Driver("Carlos", "Sainz", "CS", 55, 26)
        val team = Team("Ferrari", charles, carlos, mutableListOf(), 0)

        assertEquals("Ferrari", team.name)
    }

    @Test
    fun getPrimaryDriver() {
        val charles = Driver("Charles", "Leclerc", "CL", 16, 23)
        val carlos = Driver("Carlos", "Sainz", "CS", 55, 26)
        val team = Team("Ferrari", charles, carlos, mutableListOf(), 0)

        assertEquals(charles, team.primaryDriver)
    }

    @Test
    fun getSecondaryDriver() {
        val charles = Driver("Charles", "Leclerc", "CL", 16, 23)
        val carlos = Driver("Carlos", "Sainz", "CS", 55, 26)
        val team = Team("Ferrari", charles, carlos, mutableListOf(), 0)

        assertEquals(carlos, team.secondaryDriver)
    }

    @Test
    fun getReserveDrivers() {
        val charles = Driver("Charles", "Leclerc", "CL", 16, 23)
        val carlos = Driver("Carlos", "Sainz", "CS", 55, 26)
        val team = Team("Ferrari", charles, carlos, mutableListOf(), 0)

        assertEquals(mutableListOf<Driver>(), team.reserveDrivers)
    }

    @Test
    fun setPrimaryAndSecondaryDriverToSameDriver(){
        val charles = Driver("Charles", "Leclerc", "CL", 16, 23)

        assertThrows<IllegalStateException> {
            Team("Ferrari", charles, charles, mutableListOf(), 0)
        }
    }
}