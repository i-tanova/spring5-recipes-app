package com.ivana.tanova.recipesspringapp.controllers;

import com.ivana.tanova.recipesspringapp.domain.Category;
import com.ivana.tanova.recipesspringapp.domain.UnitOfMeasure;
import com.ivana.tanova.recipesspringapp.repositories.CategoryRepository;
import com.ivana.tanova.recipesspringapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipesController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public RecipesController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/"})
    String home(){
        Category category = categoryRepository.findByDescription("american").get();
        System.out.println("Category is: " + category.getId());

        UnitOfMeasure unitOfMeasure = unitOfMeasureRepository.findByAbbreviation("kg").get();
        System.out.println("Unit of measure " + unitOfMeasure.getId());

        return "index";
    }
}
