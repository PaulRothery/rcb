package com.rcb.dao;

import com.rcb.model.Recipe;
import com.rcb.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class RecipeDAO {

    private final RecipeRepository recipeRepository;

    public RecipeDAO(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe findById(long id) {


        String errMsg;

        Optional<Recipe> recipe = recipeRepository.findById(id);

        if (recipe.isPresent()) {
            return recipe.get();
        } else {
            errMsg = String.format("Recipe not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
