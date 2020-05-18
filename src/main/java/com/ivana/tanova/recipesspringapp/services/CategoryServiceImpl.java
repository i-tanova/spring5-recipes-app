package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.Category;
import com.ivana.tanova.recipesspringapp.repositories.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findByName(String name) {
        log.debug("Find by name: " + name);
        return categoryRepository.findByDescription(name).get();
    }
}
