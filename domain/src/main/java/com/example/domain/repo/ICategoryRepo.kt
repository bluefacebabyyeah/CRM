package com.example.domain.repo

import com.example.domain.models.Category

interface ICategoryRepo {
    suspend fun getAll(): List<Category>
    suspend fun insert(category: Category)
    suspend fun delete(category: Category)
}