package com.nvoulgaris.testingworkshop.examples.testdoubles

class CelciusTemperatureSensor : TemperatureSensor {

    override fun readTemperature(): Int {
        return 24
    }
}