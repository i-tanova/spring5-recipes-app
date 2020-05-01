package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.UnitOfMeasure;

public interface UnitOfMeasureService {
    UnitOfMeasure findByAbbreviation(String abbreviation);
}
