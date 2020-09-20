package com.nvoulgaris.testingworkshop.examples.testdoubles.manual

import com.nvoulgaris.testingworkshop.examples.testdoubles.Cooler

class MockCooler implements Cooler {

    boolean wasCalled = false
    int calledWithDegrees

    boolean wasCalled() {
        return wasCalled
    }

    int calledWithDegrees() {
        return calledWithDegrees
    }

    @Override
    void dropTemperatureTo(int degrees) {
        wasCalled = true
        calledWithDegrees = degrees
    }
}
