package com.setu.f1geek.model

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class CircuitTest {

    @Test
    fun getName() {
        val circuit = Circuit("Monza", "Italy", 5.793f, emptyList())
        assertEquals("Monza", circuit.name)
    }

    @Test
    fun getCountry() {
        val circuit = Circuit("Monza", "Italy", 5.793f, emptyList())
        assertEquals("Italy", circuit.country)
    }

    @Test
    fun getLength() {
        val circuit = Circuit("Monza", "Italy", 5.793f, emptyList())
        assertEquals(5.793f, circuit.length)
    }

    @Test
    fun getResult() {
        val result = Result("Hamilton", "Verstappen", "Bottas", 2021)
        val circuit = Circuit("Monza", "Italy", 5.793f, listOf(result))
        assertEquals(listOf(result), circuit.result)
    }

    @Test
    fun multipleResults() {
        val result1 = Result("Hamilton", "Verstappen", "Bottas", 2021)
        val result2 = Result("Verstappen", "Hamilton", "Bottas", 2022)
        val circuit = Circuit("Monza", "Italy", 5.793f, listOf(result1, result2))
        assertEquals(listOf(result1, result2), circuit.result)
    }

    @Test
    fun testCircuitStore() {
        val circuitStore = seedCircuitStore()
        assertEquals(10, circuitStore.circuits.size)
    }

    @Test
    fun circuitLengthBoundry() {
        val circuit = Circuit("Monza", "Italy", 0.0f, emptyList())
        assertEquals(0.0f, circuit.length)

        val circuit2 = Circuit("Monza", "Italy", 100.0f, emptyList())
        assertEquals(100.0f, circuit2.length)
    }
}