package com.example.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.models.CategoryEntity

@Dao
interface CategoryDao {

    @Query("select*from CategoryEntity")
    fun getAll(): List<CategoryEntity>

    @Insert
    fun insert(categoryEntity: CategoryEntity)

    @Delete
    fun delete(categoryEntity: CategoryEntity)

    @Query("select*from CategoryEntity where name = :name")
    fun getByName(name: String) : CategoryEntity?
}