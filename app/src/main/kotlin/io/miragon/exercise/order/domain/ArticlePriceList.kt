package io.miragon.exercise.order.domain

class ArticlePriceList(
    val articlePrices: Map<Int, Article>
) {

    data class Article(
        val id: Int,
        val name: String,
        val price: Double
    )

    fun priceFor(articleId: Int): Double {
        return articlePrices[articleId]?.price ?: throw IllegalArgumentException("Article not found")
    }

    fun nameFor(articleId: Int): String {
        return articlePrices[articleId]?.name ?: throw IllegalArgumentException("Article not found")
    }

}