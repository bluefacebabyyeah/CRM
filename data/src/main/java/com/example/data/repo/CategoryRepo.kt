package com.example.data.repo

import com.example.data.dao.CategoryDao
import com.example.data.models.CategoryEntity
import com.example.domain.models.Category
import com.example.domain.repo.ICategoryRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CategoryRepo @Inject constructor(
    private val dao: CategoryDao
) : ICategoryRepo {
    override suspend fun getAll(): List<Category>{
        return withContext(Dispatchers.IO){
            dao.getAll().map {
                it.toDomainModel()
            }
        }
    }
    override suspend fun insert(category: Category){
        withContext(Dispatchers.IO){
            dao.insert(CategoryEntity(
                    name = category.name,
                    description = category.description
                )
            )
        }
    }

    override suspend fun delete(category: Category){
        withContext(Dispatchers.IO){
            val entity = dao.getByName(category.name)?:return@withContext
            dao.delete(entity)
        }
    }
}