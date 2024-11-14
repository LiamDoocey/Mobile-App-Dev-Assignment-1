package com.setu.f1geek.model

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TeamTests {

    @Test
    fun getName() {
        val charles = Driver("Charles", "Leclerc", "CL", 16)
        val carlos = Driver("Carlos", "Sainz", "CS", 55)
        val team = Team("Ferrari", charles, carlos, mutableListOf())

        assertEquals("Ferrari", team.name)
    }

    @Test
    fun getPrimaryDriver() {
        val charles = Driver("Charles", "Leclerc", "CL", 16)
        val carlos = Driver("Carlos", "Sainz", "CS", 55)
        val team = Team("Ferrari", charles, carlos, mutableListOf())

        assertEquals(charles, team.primaryDriver)
    }

    @Test
    fun getSecondaryDriver() {
        val charles = Driver("Charles", "Leclerc", "CL", 16)
        val carlos = Driver("Carlos", "Sainz", "CS", 55)
        val team = Team("Ferrari", charles, carlos, mutableListOf())

        assertEquals(carlos, team.secondaryDriver)
    }

    @Test
    fun getReserveDrivers() {
        val charles = Driver("Charles", "Leclerc", "CL", 16)
        val carlos = Driver("Carlos", "Sainz", "CS", 55)
        val team = Team("Ferrari", charles, carlos, mutableListOf())

        assertEquals(mutableListOf<Driver>(), team.reserveDrivers)
    }

    @Test
    fun setPrimaryAndSecondaryDriverToSameDriver(){
        val charles = Driver("Charles", "Leclerc", "CL", 16)

        assertThrows<IllegalStateException> {
            Team("Ferrari", charles, charles, mutableListOf())
        }
    }
}