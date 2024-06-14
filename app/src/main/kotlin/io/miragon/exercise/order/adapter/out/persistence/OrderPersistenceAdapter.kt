package io.miragon.exercise.order.adapter.out.persistence

import io.miragon.exercise.order.application.port.out.OrderRepository
import io.miragon.exercise.order.domain.Order
import org.springframework.stereotype.Component
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Component
class OrderPersistenceAdapter : OrderRepository {

    val orders = ConcurrentHashMap<UUID, Order>()

    override fun getOrderById(orderId: UUID): Order {
        return orders[orderId] ?: throw IllegalArgumentException("Order not found")
    }

    override fun saveOrder(order: Order) {
        orders[order.id] = order
    }
}