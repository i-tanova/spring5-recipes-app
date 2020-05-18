package com.ivana.tanova.recipesspringapp.controllers;

import com.ivana.tanova.recipesspringapp.domain.Category;
import com.ivana.tanova.recipesspringapp.domain.Recipe;
import com.ivana.tanova.recipesspringapp.domain.UnitOfMeasure;
import com.ivana.tanova.recipesspringapp.services.RecipesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class RecipesController {

    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @RequestMapping({"", "/"})
    String home(Model model){
        log.debug("Getting index page");
        Iterable<Recipe> recipes = recipesService.getAll();
        model.addAttribute("recipes", recipes);
        return "index";
    }
}
