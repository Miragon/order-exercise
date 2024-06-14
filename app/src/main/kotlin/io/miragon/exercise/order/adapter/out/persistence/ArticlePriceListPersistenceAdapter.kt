package io.miragon.exercise.order.adapter.out.persistence

import io.miragon.exercise.order.application.port.out.ArticlePriceListRepository
import io.miragon.exercise.order.domain.ArticlePriceList
import org.springframework.stereotype.Component

@Component
class ArticlePriceListPersistenceAdapter : ArticlePriceListRepository {

    private val articlePriceList: ArticlePriceList = ArticlePriceList(
        mapOf(
            1 to ArticlePriceList.Article(
                1,
                "Apple",
                1.5
            ),
            2 to ArticlePriceList.Article(
                2,
                "Banana",
                2.0
            ),
            3 to ArticlePriceList.Article(
                3,
                "Orange",
                1.0
            ),
            4 to ArticlePriceList.Article(
                4,
                "Pineapple",
                3.0
            ),
        )
    )

    override fun getArticlePriceList(): ArticlePriceList {
        return articlePriceList
    }
}