package io.miragon.exercise.order.application.port.out.orderprocess

import java.util.UUID

interface SendPaymentOutPort {

    fun sendPayment(orderId: UUID)
}