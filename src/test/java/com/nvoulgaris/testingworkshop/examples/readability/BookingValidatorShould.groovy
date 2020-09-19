package com.nvoulgaris.testingworkshop.examples.readability

import spock.lang.Specification

class BookingValidatorShould extends Specification {

    def "throwAnExceptionWhenBookingIdIsNull"() {
        given:
          Booking booking = new Booking(bookingId: null)
          BookingValidator bookingValidator = new BookingValidator()
        when:
          bookingValidator.validate(booking)
        then:
          thrown(ValidationException)
    }
}
