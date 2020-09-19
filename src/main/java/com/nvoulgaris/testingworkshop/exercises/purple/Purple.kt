package com.nvoulgaris.testingworkshop.exercises.purple

import com.nvoulgaris.testingworkshop.exercises.purple.Vehicle.CAR
import com.nvoulgaris.testingworkshop.exercises.purple.Vehicle.MOTORCYCLE

class Purple {

    companion object {
        private const val MINUTES_FOR_A_KILOMETER_WITH_CAR = 2
        private const val MINUTES_FOR_A_KILOMETER_WITH_MOTORCYCLE = 1
        private const val MINUTES_FOR_EACH_TRAFFIC_LIGHT = 1
    }

    fun durationEstimationFor(route: Route): Int {
        var minutes = 0

        if (route.vehicle == CAR)
            minutes = calculateForCar(route)
        if (route.vehicle == MOTORCYCLE)
            minutes = calculateForMotorcycle(route)

        if (route.isRushHour)
            minutes *= 2

        minutes += route.numOfTrafficLights * MINUTES_FOR_EACH_TRAFFIC_LIGHT
        return minutes
    }

    private fun calculateForCar(route: Route): Int {
        return route.distanceInKm * MINUTES_FOR_A_KILOMETER_WITH_CAR
    }

    private fun calculateForMotorcycle(route: Route): Int {
        return route.distanceInKm * MINUTES_FOR_A_KILOMETER_WITH_MOTORCYCLE
    }
}

data class Route(
        val vehicle: Vehicle,
        val distanceInKm: Int,
        val isRushHour: Boolean,
        val numOfTrafficLights: Int
)

enum class Vehicle {
    CAR,
    MOTORCYCLE;
}
