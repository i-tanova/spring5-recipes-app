package com.ivana.tanova.recipesspringapp.bootstrap;

import com.ivana.tanova.recipesspringapp.domain.*;
import com.ivana.tanova.recipesspringapp.services.CategoryService;
import com.ivana.tanova.recipesspringapp.services.RecipesService;
import com.ivana.tanova.recipesspringapp.services.UnitOfMeasureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
      private final RecipesService recipesService;
      private final CategoryService categoryService;
      private final UnitOfMeasureService unitOfMeasureService;

    public DataLoader(RecipesService recipesService, CategoryService categoryService, UnitOfMeasureService unitOfMeasureService) {
        this.recipesService = recipesService;
        this.categoryService = categoryService;
        this.unitOfMeasureService = unitOfMeasureService;
    }


    @Override
    public void run(String... args) throws Exception {
        addPerfectGuacamoly();
        addSpicyGrilledChickenTakos();
    }

    private void addPerfectGuacamoly() {
        Recipe perfectGuacamoly = new Recipe();

        perfectGuacamoly.setDescription("How to Make Perfect Guacamole Recipe");
        perfectGuacamoly.setDirections("1 Cut the avocado, remove flesh: Cut the avocados in half. Remove the pit. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. (See How to Cut and Peel an Avocado.) Place in a bowl.");
        perfectGuacamoly.setDifficulty(Difficulty.EASY);
        perfectGuacamoly.setPrepTime(10);

        Set<Category> categorySet = new HashSet<Category>();
        Category category =  categoryService.findByName("american");
        categorySet.add(category);
        perfectGuacamoly.setCategories(categorySet);


        Notes notes = new Notes();
        notes.setRecipeNotes("Be careful handling chiles if using. Wash your hands thoroughly after handling and do not touch your eyes or the area near your eyes with your hands for several hours.");
        // WE DONT NEED TO DO THAT notes.setRecipe(perfectGuacamoly);
        perfectGuacamoly.setNotes(notes);
        notes.setRecipe(perfectGuacamoly);

        UnitOfMeasure teaspoon = unitOfMeasureService.findByAbbreviation("teaspoon");
        UnitOfMeasure dash = unitOfMeasureService.findByAbbreviation("dash");
        UnitOfMeasure tablespoon = unitOfMeasureService.findByAbbreviation("tablespoon");

        Ingredient avocado = new Ingredient();
        avocado.setAmount(new BigDecimal(2));
        avocado.setDescription("ripe avocados");
        avocado.setRecipe(perfectGuacamoly);

        Ingredient salt = new Ingredient();
        salt.setDescription("of salt, more to taste");
        salt.setAmount(new BigDecimal(0.25));
        salt.setUnitOfMeasure(teaspoon);
        salt.setRecipe(perfectGuacamoly);

        Ingredient blackPepper = new Ingredient();
        blackPepper.setDescription("of freshly grated black pepper");
        blackPepper.setUnitOfMeasure(dash);
        blackPepper.setRecipe(perfectGuacamoly);

        Ingredient limejuice = new Ingredient();
        limejuice.setAmount(new BigDecimal(1));
        limejuice.setDescription("fresh lime juice or lemon juice");
        limejuice.setUnitOfMeasure(tablespoon);
        limejuice.setRecipe(perfectGuacamoly);

        Set<Ingredient> ingredientsSet = new HashSet<Ingredient>();
        ingredientsSet.add(avocado);
        ingredientsSet.add(salt);
        ingredientsSet.add(blackPepper);
        ingredientsSet.add(limejuice);
        perfectGuacamoly.setIngredientSet(ingredientsSet);

        recipesService.save(perfectGuacamoly);
        System.out.println("Recipe saved");
    }

    private void addSpicyGrilledChickenTakos() {
        Recipe spicyChickenTakos = new Recipe();

        spicyChickenTakos.setDescription("Spicy Grilled Chicken Tacos");
        spicyChickenTakos.setDirections("1 Prepare a gas or charcoal grill for medium-high, direct heat.\n" +
                "\n" +
                "2 Make the marinade and coat the chicken: In a large bowl, stir together the chili powder, oregano, cumin, sugar, salt, garlic and orange zest. Stir in the orange juice and olive oil to make a loose paste. Add the chicken to the bowl and toss to coat all over.\n" +
                "\n" +
                "Set aside to marinate while the grill heats and you prepare the rest of the toppings.");
        spicyChickenTakos.setDifficulty(Difficulty.EASY);
        spicyChickenTakos.setPrepTime(20);

        Set<Category> categorySet = new HashSet<Category>();
        Category category =  categoryService.findByName("american");
        categorySet.add(category);
        spicyChickenTakos.setCategories(categorySet);;

        Notes notes = new Notes();
        notes.setRecipeNotes("Spicy grilled chicken tacos! Quick marinade, then grill. Ready in about 30 minutes. Great for a quick weeknight dinner, backyard cookouts, and tailgate parties.");
        // WE DONT NEED TO DO THAT notes.setRecipe(savedSpicyTakos);
        spicyChickenTakos.setNotes(notes);
        notes.setRecipe(spicyChickenTakos);

        UnitOfMeasure teaspoon = unitOfMeasureService.findByAbbreviation("teaspoon");
        UnitOfMeasure dash = unitOfMeasureService.findByAbbreviation("dash");
        UnitOfMeasure tablespoon = unitOfMeasureService.findByAbbreviation("tablespoon");

        Ingredient ancho = new Ingredient();
        ancho.setAmount(new BigDecimal(2));
        ancho.setUnitOfMeasure(tablespoon);
        ancho.setDescription("ancho chili powder");
        ancho.setRecipe(spicyChickenTakos);

        Ingredient oregano = new Ingredient();
        oregano.setDescription("dried oregano");
        oregano.setAmount(new BigDecimal(1));
        oregano.setUnitOfMeasure(teaspoon);
        oregano.setRecipe(spicyChickenTakos);

        Ingredient cumin = new Ingredient();
        cumin.setDescription("dried cumin");
        cumin.setAmount(new BigDecimal(1));
        cumin.setUnitOfMeasure(teaspoon);
        cumin.setRecipe(spicyChickenTakos);

        Set<Ingredient> ingredientsSet = new HashSet<Ingredient>();
        ingredientsSet.add(ancho);
        ingredientsSet.add(oregano);
        ingredientsSet.add(cumin);
        spicyChickenTakos.setIngredientSet(ingredientsSet);

        recipesService.save(spicyChickenTakos);
        System.out.println("Recipe saved");
    }
}
