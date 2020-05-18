package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Recipe;
import com.ivana.tanova.recipesspringapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RecipesServiceImpl implements RecipesService {
    private final RecipeRepository recipeRepository;

    public RecipesServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Iterable<Recipe> getAll() {
        log.debug("Get recipes");
        return recipeRepository.findAll();
    }

    @Override
    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
