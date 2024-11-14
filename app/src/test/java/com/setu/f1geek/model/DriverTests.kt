package com.setu.f1geek.model

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class DriverTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun getFirstName() {
        val driver = Driver("Lewis", "Hamilton", "HAM", 44)
        assertEquals("Lewis", driver.firstName)
    }

    @Test
    fun getSurName() {
        val driver = Driver("Lewis", "Hamilton", "HAM", 44)
        assertEquals("Hamilton", driver.surName)
    }

    @Test
    fun getAbbreviatedName() {
        val driver = Driver("Lewis", "Hamilton", "HAM", 44)
        assertEquals("HAM", driver.abbreviatedName)
    }

    @Test
    fun getNumber() {
        val driver = Driver("Lewis", "Hamilton", "HAM", 44)
        assertEquals(44, driver.number)
    }
}