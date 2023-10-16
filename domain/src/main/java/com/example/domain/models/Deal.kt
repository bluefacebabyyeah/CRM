package com.example.domain.models

data class Deal (
    val category : Category,
    val nameDeal : String,
    val priceDeal : Double,
    val descriptionDeal : String
    ) {
    val dateDeal : Long = System.currentTimeMillis()
}