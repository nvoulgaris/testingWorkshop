package com.nvoulgaris.testingworkshop.examples.testdoubles.manual


import com.nvoulgaris.testingworkshop.examples.testdoubles.TemperatureService
import spock.lang.Specification

class TemperatureServiceSpec extends Specification {

    MockTemperatureSensor temperatureSensor
    MockCooler cooler
    TemperatureService temperatureService

    def setup() {
        temperatureSensor = new MockTemperatureSensor()
        cooler = new MockCooler()
        temperatureService = new TemperatureService(temperatureSensor, cooler)
    }

    def "should maintain the temperature in 15 degrees"() {
        given:
          temperatureSensor.setTemperature(23)
        when:
          temperatureService.regulateTemperature()
        then:
          cooler.wasCalled()
          cooler.calledWithDegrees() == 15
    }
}
