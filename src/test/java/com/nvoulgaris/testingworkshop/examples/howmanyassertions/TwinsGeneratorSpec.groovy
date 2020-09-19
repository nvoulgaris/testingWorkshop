package com.nvoulgaris.testingworkshop.examples.howmanyassertions

import spock.lang.Specification

class TwinsGeneratorSpec extends Specification {

    def "should validate the number of twins"() {
        given:
          TwinsGenerator generator = new TwinsGenerator()
        when:
          def twinsCount = generator.makesTwins()
        then:
          twinsCount % 2 == 0
        and:
          twinsCount > 0
    }
}
