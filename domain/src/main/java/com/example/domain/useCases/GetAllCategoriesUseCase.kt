package com.example.domain.useCases

import com.example.domain.models.Category
import com.example.domain.repo.ICategoryRepo
import javax.inject.Inject

class GetAllCategoriesUseCase @Inject constructor(
    private val categoryRepo: ICategoryRepo
) {

    suspend fun getList(): List<Category> {
        return categoryRepo.getAll()
    }
}