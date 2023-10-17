package com.example.domain.useCases

import com.example.domain.models.Category
import com.example.domain.repo.ICategoryRepo
import javax.inject.Inject

class AddNewCategoryUseCase @Inject constructor(
    private val categoryRepo : ICategoryRepo
){
    suspend fun addNewCategory(category: Category) {
        categoryRepo.insert(category)
    }
}