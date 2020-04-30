package com.ivana.tanova.recipesspringapp.repositories;

import com.ivana.tanova.recipesspringapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
