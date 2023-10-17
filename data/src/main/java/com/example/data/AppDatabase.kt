package com.example.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.dao.CategoryDao
import com.example.data.models.CategoryEntity
import com.example.data.models.DealEntity

@Database(
    entities = [
        CategoryEntity::class,
        DealEntity::class
    ],
    version = 1
)

abstract class AppDatabase:RoomDatabase() {
    abstract fun getCategoryDao():CategoryDao
    //abstract fun getDealDao():DealDao
}