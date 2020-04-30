package com.ivana.tanova.recipesspringapp.repositories;

import com.ivana.tanova.recipesspringapp.domain.Category;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
