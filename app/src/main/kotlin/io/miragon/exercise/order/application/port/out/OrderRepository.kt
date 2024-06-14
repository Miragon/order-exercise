package io.miragon.exercise.order.application.port.out

import io.miragon.exercise.order.domain.Order
import java.util.*

interface OrderRepository {

    fun getOrderById(orderId: UUID): Order

    fun saveOrder(order: Order)
}