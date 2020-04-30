package com.ivana.tanova.recipesspringapp.repositories;

import com.ivana.tanova.recipesspringapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByAbbreviation(String abbreviation);
}
