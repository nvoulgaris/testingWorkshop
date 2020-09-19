package com.nvoulgaris.testingworkshop.examples.assertfirst

class AccountRepository {

    fun save(transaction: Transaction) {
        if (transaction.type != "DEPOSIT")
            throw UnknownTransactionException()
    }
}