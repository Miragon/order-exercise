package io.miragon.exercise.order.application.port.`in`

import java.util.*

interface PayOrderUserCase {

    fun payOrder(orderId: UUID)
}