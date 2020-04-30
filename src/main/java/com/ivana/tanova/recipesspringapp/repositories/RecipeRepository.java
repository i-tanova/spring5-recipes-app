package com.ivana.tanova.recipesspringapp.repositories;

import com.ivana.tanova.recipesspringapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
