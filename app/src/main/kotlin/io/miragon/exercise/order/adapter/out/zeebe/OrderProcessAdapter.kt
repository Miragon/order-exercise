package io.miragon.exercise.order.adapter.out.zeebe

import io.camunda.zeebe.client.ZeebeClient
import io.miragon.exercise.order.application.port.out.orderprocess.SendPaymentOutPort
import io.miragon.exercise.order.application.port.out.orderprocess.StartOrderProcessOutPort
import org.springframework.stereotype.Component
import java.util.*

@Component
class OrderProcessAdapter(
    private val zeebeClient: ZeebeClient
) : StartOrderProcessOutPort, SendPaymentOutPort {

    private val PROCESS_ID = "order-process"

    override fun startOrderProcess(orderId: UUID) {
        zeebeClient.newCreateInstanceCommand()
            .bpmnProcessId(PROCESS_ID)
            .latestVersion()
            .variables(mapOf("orderId" to orderId.toString()))
            .send()
            .join()
    }

    override fun sendPayment(orderId: UUID) {
        //How can we correlate the payment?
    }
}