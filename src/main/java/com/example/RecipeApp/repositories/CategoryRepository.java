package com.example.RecipeApp.repositories;

import com.example.RecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryRepository extends CrudRepository<Category, Long> {
}
