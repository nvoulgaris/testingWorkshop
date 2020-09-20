package com.nvoulgaris.testingworkshop.examples.testdoubles

import spock.lang.Specification

class TemperatureServiceSpec extends Specification {

    TemperatureSensor temperatureSensor
    Cooler cooler
    TemperatureService temperatureService

    def setup() {
        temperatureSensor = Mock()
        cooler = Mock()
        temperatureService = new TemperatureService(temperatureSensor, cooler)
    }

    def "should maintain the temperature in 15 degrees"() {
      given:
        temperatureSensor.readTemperature() >> 23
      when:
        temperatureService.regulateTemperature()
      then:
        cooler.dropTemperatureTo(15)
    }
}
