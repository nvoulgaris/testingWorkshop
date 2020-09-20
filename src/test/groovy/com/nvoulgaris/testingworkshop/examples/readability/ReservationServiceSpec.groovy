package com.nvoulgaris.testingworkshop.examples.readability

import java.time.LocalDate
import spock.lang.Specification

class ReservationServiceSpec extends Specification {

    def "should process a credit card payment for a reservation"() {
        given:
          Payment payment = new Payment()
          payment.status = "UNPAID"
          payment.method = "Credit Card"
          payment.amount = 100
          Client client = new Client()
          client.firstName = "John"
          client.lastName = "Smith"
          client.dateOfBirth = LocalDate.of(1990, 12, 4)
          Reservation reservation = new Reservation()
          reservation.reservationId = 123
          reservation.date = LocalDate.now()
          reservation.client = client
          reservation.payment = payment
        when:
          ReservationService reservationService = new ReservationService()
          reservationService.processPaymentFor(reservation)
        then:
          assert reservation.payment.status == "PAID"
          assert reservation.payment.method == "Credit Card"
          assert reservation.payment.amount == 100
    }

    def "should throw an exception when amount is not a positive integer"() {
        given:
          Payment payment = new Payment()
          payment.status = "UNPAID"
          payment.method = "Credit card"
          payment.amount = -50
          Client client = new Client()
          client.firstName = "John"
          client.lastName = "Smith"
          client.dateOfBirth = LocalDate.of(1990, 12, 4)
          Reservation reservation = new Reservation()
          reservation.reservationId = 123
          reservation.date = LocalDate.now()
          reservation.client = client
          reservation.payment = payment
        when:
          ReservationService reservationService = new ReservationService()
          reservationService.processPaymentFor(reservation)
        then:
          thrown(ValidationException)
    }
}
