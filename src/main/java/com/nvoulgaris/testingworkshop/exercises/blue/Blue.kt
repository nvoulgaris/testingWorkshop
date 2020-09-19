package com.nvoulgaris.testingworkshop.exercises.blue

class Blue {

    companion object {
        private const val DAYS_IN_A_WEEK = 7
        private const val DISCOUNT_PERCENT = 15.0
        private const val INCREASE_FACTOR = (100 - DISCOUNT_PERCENT) / 100
    }

    fun priceFor(flat: Flat, reservationDurationInDays: Int, guests: Int): Int {
        var price = 0

        if (reservationDurationInDays < DAYS_IN_A_WEEK)
            price = calculateShortTermPriceFor(flat, reservationDurationInDays)
        else
            price = calculateLongTermPriceFor(flat, reservationDurationInDays)

        price += flat.cleaningFee
        price += (guests - 1) * flat.extraGuestFee

        price = applyFakeDiscountTo(price)
        return price
    }

    private fun calculateShortTermPriceFor(flat: Flat, reservationDurationInDays: Int): Int {
        return flat.dailyPriceForShortTermLeases * reservationDurationInDays
    }

    private fun calculateLongTermPriceFor(flat: Flat, reservationDurationInDays: Int): Int {
        return flat.dailyPriceForLongTermLease * reservationDurationInDays
    }

    /**
     * The flat will appear to offer 15% discount.
     * The discount is actually fake, so this function
     * increases the price in order to reach the real
     * price when a 15% discount is applied to this,
     * increased price.
     */
    private fun applyFakeDiscountTo(price: Int): Int {
        return Math.ceil(price / INCREASE_FACTOR).toInt()
    }
}

data class Flat(
        val dailyPriceForShortTermLeases: Int,
        val dailyPriceForLongTermLease: Int,
        val cleaningFee: Int,
        val extraGuestFee: Int
)