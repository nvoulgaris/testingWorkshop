package com.nvoulgaris.testingworkshop.examples.howmanyassertions

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "should divide two numbers"() {
        given:
          Calculator calculator = new Calculator()
        when:
          def result = calculator.divide(6, 3)
        then:
          result == 2
        when:
          calculator.divide(6, 0)
        then:
          thrown(ArithmeticException)
    }
}
