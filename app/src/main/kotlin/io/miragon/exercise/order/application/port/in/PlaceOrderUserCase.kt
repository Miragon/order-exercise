package io.miragon.exercise.order.application.port.`in`

interface PlaceOrderUserCase {

    fun placeOrder(command: PlaceOrderCommand)

    data class PlaceOrderCommand(
        val customer: String,
        val orderItems: List<OrderItem>
    )

    class OrderItem(
        val articleId: Int,
        val quantity: Int
    )


}