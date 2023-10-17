package com.example.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.models.Category

@Entity
data class CategoryEntity(
    val name : String,
    val description : String,
    @PrimaryKey(autoGenerate = true) val id:Int = 0
) {
    fun toDomainModel() =
        Category(
            name = name,
            description = description,
        )
}
