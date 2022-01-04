package com.rcb.service;

import com.rcb.model.*;
import com.rcb.repository.RecipeRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        removeEmptyAssociations(recipe);


        if (recipeRepository.existsById(Long.valueOf(id))) {
            Optional<Recipe> oldRecipe;
            oldRecipe = recipeRepository.findById(Long.valueOf(id));
            recipe.setId(oldRecipe.get().getId());
            recipeRepository.save(recipe);
        }
        return recipe;
    }

    /**
     * if any of the recipe associated records are empty there will be
     * by default one entry as a result of an empty one being presented
     * in the ui. this can be identified when the name is empty. so before
     * updating the recipe ensure that it is removed i.e. really empty
     * @param recipe
     */
    private void removeEmptyAssociations(Recipe recipe) {

        // grains
        if (recipe.getRecipeGrains().size() == 1) {

            List<RecipeGrain> recipeGrains = new ArrayList<>(recipe.getRecipeGrains());
            if (recipeGrains.get(0).getName().isEmpty()) {
                recipe.getRecipeGrains().clear();
            }
        }

        // hops
        if (recipe.getRecipeHops().size() == 1) {

            List<RecipeHop> recipeHops = new ArrayList<>(recipe.getRecipeHops());
            if (recipeHops.get(0).getName().isEmpty()) {
                recipe.getRecipeHops().clear();
            }
        }

        // salts
        if (recipe.getRecipeSalts().size() == 1) {

            List<RecipeSalt> recipeSalts = new ArrayList<>(recipe.getRecipeSalts());
            if (recipeSalts.get(0).getName().isEmpty()) {
                recipe.getRecipeSalts().clear();
            }
        }

        // adjuncts
        if (recipe.getRecipeAdjuncts() != null && recipe.getRecipeAdjuncts().size() == 1) {

            List<RecipeAdjunct> recipeAdjuncts = new ArrayList<>(recipe.getRecipeAdjuncts());
            if (recipeAdjuncts.get(0).getName().isEmpty()) {
                recipe.getRecipeAdjuncts().clear();
            }
        }

        // brewers
        if (recipe.getRecipeBrewers().size() == 1) {

            List<RecipeBrewer> recipeBrewers = new ArrayList<>(recipe.getRecipeBrewers());
            if (recipeBrewers.get(0).getName().isEmpty()) {
                recipe.getRecipeBrewers().clear();
            }
        }


        // brewlogs
        if (recipe.getBrewLogs().size() == 1) {

            List<BrewLog> recipeBrewLogs = new ArrayList<>(recipe.getBrewLogs());
            if (StringUtils.isEmpty(recipeBrewLogs.get(0).getBrewer())) {
                recipe.getBrewLogs().clear();
            }
        }

    }


}
