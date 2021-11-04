package com.rcb.service;

import com.rcb.model.Recipe;
import com.rcb.repository.RecipeRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@Slf4j
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    public List<Recipe> findAll() {

        return recipeRepository.findAll();
    }

    public Recipe findRecipe(String name) {

        Optional<Recipe> recipe;
        if (NumberUtils.isCreatable(name)) {
            recipe = recipeRepository.findById(Long.valueOf(name));
        } else {
            recipe = recipeRepository.findRecipeByName(name);
        }

        return recipe.get();
    }

    public Recipe createRecipe(Recipe recipe) {
        recipe = recipeRepository.save(recipe);
        return recipe;
    }

    public Recipe updateRecipe(String id, Recipe recipe) {

        if (recipeRepository.existsById(Long.valueOf(id))) {
            Optional<Recipe> oldRecipe;
            oldRecipe = recipeRepository.findById(Long.valueOf(id));
            recipe.setId(oldRecipe.get().getId());
            recipeRepository.save(recipe);
        }
        return recipe;
    }


}
