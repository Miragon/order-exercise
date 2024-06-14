package io.miragon.exercise.order.domain

import java.util.*

data class Order(
    val id: UUID = UUID.randomUUID(),
    val customer: String,
    val payed: Boolean = false,
    val items: List<OrderItem>
) {

    // should be calculated from items
    fun total(): Int {
        return 100
    }

    data class OrderItem(
        val id: UUID = UUID.randomUUID(),
        val articleId: Int,
        val name: String,
        val price: Double,
        val quantity: Int
    )

}