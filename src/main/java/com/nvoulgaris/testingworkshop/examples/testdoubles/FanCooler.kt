package com.nvoulgaris.testingworkshop.examples.testdoubles

class FanCooler : Cooler {

    override fun dropTemperatureTo(degrees: Int) {
        println("Target temperature: $degrees")
    }
}