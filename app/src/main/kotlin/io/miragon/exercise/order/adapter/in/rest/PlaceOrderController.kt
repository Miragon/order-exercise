package io.miragon.exercise.order.adapter.`in`.rest

import io.miragon.exercise.order.application.port.`in`.PlaceOrderUserCase
import mu.KotlinLogging
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PlaceOrderController(private val useCase: PlaceOrderUserCase) {

    private val log = KotlinLogging.logger {}

    @PostMapping("/order")
    fun placeOrder(
        @RequestBody order: PlaceOrderDto
    ) {
        log.debug { "Received request to place order" }
        this.useCase.placeOrder(order.toCommand())
    }
}
