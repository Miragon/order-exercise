package io.miragon.exercise.order.adapter.`in`.zeebe

import io.camunda.zeebe.spring.client.annotation.JobWorker
import io.camunda.zeebe.spring.client.annotation.VariablesAsType
import io.miragon.exercise.order.application.port.`in`.orderprocess.CheckOrderUseCase
import io.miragon.exercise.order.application.port.`in`.orderprocess.CheckOrderUseCase.CheckOrderResponse
import org.springframework.stereotype.Component

@Component
class CheckOrderWorker(private val useCase: CheckOrderUseCase) {

    @JobWorker(type = "check-order")
    fun checkOrder(@VariablesAsType command: CheckOrderUseCase.CheckOrderCommand): CheckOrderResponse {
        return this.useCase.checkOrder(command)
    }

}
