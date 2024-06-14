package io.miragon.exercise.order.application.service

import io.miragon.exercise.order.application.port.`in`.PlaceOrderUserCase
import io.miragon.exercise.order.application.port.out.ArticlePriceListRepository
import io.miragon.exercise.order.application.port.out.OrderRepository
import io.miragon.exercise.order.application.port.out.orderprocess.StartOrderProcessOutPort
import io.miragon.exercise.order.domain.Order
import org.springframework.stereotype.Service

@Service
class PlaceOrderService(
    private val orderRepository: OrderRepository,
    private val priceListRepository: ArticlePriceListRepository,
    private val startOrderProcessOutPort: StartOrderProcessOutPort
) : PlaceOrderUserCase {

    override fun placeOrder(command: PlaceOrderUserCase.PlaceOrderCommand) {

        val priceList = priceListRepository.getArticlePriceList()

        val order = Order(
            customer = command.customer,
            items = command.orderItems.map {
                Order.OrderItem(
                    articleId = it.articleId,
                    price = priceList.priceFor(it.articleId),
                    quantity = it.quantity,
                    name = priceList.nameFor(it.articleId)
                )
            }
        )

        startOrderProcessOutPort.startOrderProcess(order.id)

        orderRepository.saveOrder(order)


    }
}