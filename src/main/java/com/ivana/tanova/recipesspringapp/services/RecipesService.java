package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Recipe;

import java.util.Set;

public interface RecipesService {
    Iterable<Recipe> getAll();

    Recipe save(Recipe recipe);
}
