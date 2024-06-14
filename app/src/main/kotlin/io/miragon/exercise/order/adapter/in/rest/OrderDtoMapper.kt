package io.miragon.exercise.order.adapter.`in`.rest

import io.miragon.exercise.order.application.port.`in`.PlaceOrderUserCase


fun PlaceOrderDto.toCommand() = PlaceOrderUserCase.PlaceOrderCommand(
    customer = customer,
    orderItems = orderItems.map {
        PlaceOrderUserCase.OrderItem(
            articleId = it.articleId,
            quantity = it.quantity
        )
    }
)