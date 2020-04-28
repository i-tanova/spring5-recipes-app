package com.ivana.tanova.recipesspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipesController {

    @RequestMapping({"", "/"})
    String home(){
        return "index";
    }
}
