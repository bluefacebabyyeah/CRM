package com.example.domain.models

data class Deal (
    val category : Category,
    val name : String,
    val price : Double,
    val description : String
    ) {
    val date : Long = System.currentTimeMillis()
}