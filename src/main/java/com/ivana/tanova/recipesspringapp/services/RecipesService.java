package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Recipe;
import lombok.extern.slf4j.Slf4j;

public interface RecipesService {
    Iterable<Recipe> getAll();

    Recipe save(Recipe recipe);
}
