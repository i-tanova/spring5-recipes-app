package com.ivana.tanova.recipesspringapp.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setup(){
        category = new Category();
    }
    @Test
    void getId() {
        category.setId(4l);
        assertEquals(4l, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipeSet() {
    }
}