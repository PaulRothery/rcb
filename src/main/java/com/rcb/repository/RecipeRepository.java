package com.rcb.repository;


import com.rcb.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {


    @Query("SELECT recipe FROM Recipe recipe WHERE recipe.name = ?1")
    Optional<Recipe> findRecipeByName(String name);


}
