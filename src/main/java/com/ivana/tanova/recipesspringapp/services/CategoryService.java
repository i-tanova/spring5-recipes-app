package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Category;

public interface CategoryService {
    Category findByName(String name);
}
