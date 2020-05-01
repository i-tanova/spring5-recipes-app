package com.ivana.tanova.recipesspringapp.services;

import com.ivana.tanova.recipesspringapp.domain.UnitOfMeasure;
import com.ivana.tanova.recipesspringapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitOfMeasuresServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository repository;

    public UnitOfMeasuresServiceImpl(UnitOfMeasureRepository repository) {
        this.repository = repository;
    }

    @Override
    public UnitOfMeasure findByAbbreviation(String abbreviation) {
        return repository.findByAbbreviation(abbreviation).get();
    }
}
