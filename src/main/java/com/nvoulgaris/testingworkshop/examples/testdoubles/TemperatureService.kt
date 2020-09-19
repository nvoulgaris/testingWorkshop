package com.nvoulgaris.testingworkshop.examples.testdoubles

class TemperatureService(
        private val temperatureSensor: TemperatureSensor,
        private val cooler: Cooler
) {

    fun regulateTemperature() {
        val currentTemperature = temperatureSensor.readTemperature()
        if (currentTemperature > 20) {
            cooler.dropTemperatureTo(15)
        }
    }
}