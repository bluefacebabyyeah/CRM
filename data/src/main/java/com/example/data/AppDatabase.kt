package com.example.data

import androidx.room.Database
import com.example.data.models.CategoryEntity
import com.example.data.models.DealEntity

@Database(
    entities = [
        CategoryEntity::class,
        DealEntity::class
    ],
    version = 1
)

abstract class AppDatabase {
}