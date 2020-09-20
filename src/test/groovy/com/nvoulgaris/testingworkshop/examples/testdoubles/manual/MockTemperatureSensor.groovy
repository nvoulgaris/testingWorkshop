package com.nvoulgaris.testingworkshop.examples.testdoubles.manual

import com.nvoulgaris.testingworkshop.examples.testdoubles.TemperatureSensor

class MockTemperatureSensor implements TemperatureSensor {

    int temperature;

    void setTemperature(Integer temperature) {
        this.temperature = temperature
    }

    @Override
    int readTemperature() {
        return temperature
    }
}
