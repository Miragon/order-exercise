package io.miragon.exercise.order.adapter.`in`.rest

import jakarta.websocket.server.PathParam
import mu.KotlinLogging
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api")
class PayOrderController() {

    private val log = KotlinLogging.logger {}

    @PostMapping("/order/:id/pay")
    fun payOrder(
        @PathParam("id") orderId: UUID
    ) {
        log.debug { "Received request to pay order" }
        //  we need the use case to pay the order
    }
}
