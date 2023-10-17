package com.example.data.models

import androidx.room.Entity
import com.example.domain.models.Category
import com.example.domain.models.Deal

@Entity
data class DealEntity(
    val category : Category,
    val name : String,
    val price : Double,
    val description : String
) {
    fun toDomainModel() =
        Deal(
            category = category,
            name = name,
            price = price,
            description = description
        )
}