package com.nvoulgaris.testingworkshop.examples.readability

import java.time.LocalDate

data class Reservation(
        var reservationId: Int? = null,
        var date: LocalDate? = null,
        var client: Client? = null,
        var payment: Payment? = null
)

data class Client(
        var firstName: String? = null,
        var lastName: String? = null,
        var dateOfBirth: LocalDate? = null
)

data class Payment(
        var status: String? = null,
        var method: String? = null,
        var amount: Int? = null
)
