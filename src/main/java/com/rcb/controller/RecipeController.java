package com.rcb.controller;

import com.rcb.model.Recipe;
import com.rcb.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Recipe> getAllRecipe() {
        return recipeService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Recipe>  getRecipe(@PathVariable String name) {
        List<Recipe> recipes = new ArrayList<>();
        Recipe recipe = recipeService.findRecipe(name);
        recipes.add(recipe);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe Not Found");
        }

        return recipes;
    }

    @PostMapping("")
    public @ResponseBody
    Recipe createRecipe(@RequestBody Recipe recipe) {
        recipe = recipeService.createRecipe(recipe);

        return recipe;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Recipe updateRecipe(@PathVariable String id, @RequestBody Recipe recipe) {
            recipe = recipeService.updateRecipe(id, recipe);

        return recipe;
    }

}

