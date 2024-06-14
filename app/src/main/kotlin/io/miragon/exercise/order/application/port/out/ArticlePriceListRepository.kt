package io.miragon.exercise.order.application.port.out

import io.miragon.exercise.order.domain.ArticlePriceList

interface ArticlePriceListRepository {

    fun getArticlePriceList(): ArticlePriceList

}
