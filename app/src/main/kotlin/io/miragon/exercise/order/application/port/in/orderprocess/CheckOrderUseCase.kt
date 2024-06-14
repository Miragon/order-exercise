package io.miragon.exercise.order.application.port.`in`.orderprocess

import java.util.*

interface CheckOrderUseCase {

    fun checkOrder(command: CheckOrderCommand): CheckOrderResponse

    data class CheckOrderCommand(
        val orderId: UUID
    )

    data class CheckOrderResponse(
        val orderOK: Boolean
    )
}