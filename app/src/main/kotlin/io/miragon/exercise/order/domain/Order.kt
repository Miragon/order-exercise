package io.miragon.exercise.order.domain

import java.util.*

data class Order(
    val id: UUID = UUID.randomUUID(),
    val customer: String,
    var payed: Boolean = false,
    val items: List<OrderItem>
) {

    // should be calculated from items
    fun total(): Int {
        return 100
    }

    fun payOrder() {
        if (payed) {
            throw IllegalStateException("Order already payed")
        }
        payed = true
    }

    data class OrderItem(
        val id: UUID = UUID.randomUUID(),
        val articleId: Int,
        val name: String,
        val price: Double,
        val quantity: Int
    )

}