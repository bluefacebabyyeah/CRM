package com.example.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.models.Deal

@Entity
data class DealEntity(
    val categoryId : Long,
    val name : String,
    val price : Double,
    val description : String,
    @PrimaryKey(autoGenerate = true) val id:Int = 0
) {
    fun toDomainModel() =
        Deal(
            categoryId = categoryId,
            name = name,
            price = price,
            description = description
        )
}