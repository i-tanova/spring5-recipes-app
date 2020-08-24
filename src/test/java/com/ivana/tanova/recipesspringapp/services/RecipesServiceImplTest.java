package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Recipe;
import com.ivana.tanova.recipesspringapp.repositories.RecipeRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipesServiceImplTest {

    RecipesServiceImpl recipesService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        recipesService = new RecipesServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes(){
        Set<Recipe>
    }

    @Test
    void getAll() {
    }

    @Test
    void save() {
    }
}