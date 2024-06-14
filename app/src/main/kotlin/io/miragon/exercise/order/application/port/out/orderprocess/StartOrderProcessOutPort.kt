package io.miragon.exercise.order.application.port.out.orderprocess

import java.util.*

interface StartOrderProcessOutPort {

    fun startOrderProcess(orderId : UUID)
}