package io.miragon.exercise.order.adapter.`in`.rest

data class PlaceOrderDto(
    val customer: String,
    val orderItems: List<OrderItemDto>
) {

    class OrderItemDto(
        val articleId: Int,
        val quantity: Int
    )
}
