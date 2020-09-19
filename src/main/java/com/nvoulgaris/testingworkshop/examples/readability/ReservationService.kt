package com.nvoulgaris.testingworkshop.examples.readability

class ReservationService {

    fun processPaymentFor(reservation: Reservation) {
        if (reservation.payment!!.amount!! <= 0)
            throw ValidationException()

        reservation.payment!!.status = "PAID"
    }
}