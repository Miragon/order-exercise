package io.miragon.exercise.order.application.service

import io.miragon.exercise.order.application.port.`in`.orderprocess.CheckOrderUseCase
import org.springframework.stereotype.Component

@Component
class CheckOrderService : CheckOrderUseCase {

    override fun checkOrder(command: CheckOrderUseCase.CheckOrderCommand): CheckOrderUseCase.CheckOrderResponse {
        return CheckOrderUseCase.CheckOrderResponse(orderOK = true)
    }
}