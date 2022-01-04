package com.rcb.controller.enums;

import com.rcb.service.enums.RecipeStatusService;
import com.rcb.validvalues.RecipeStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("recipestatus")
public class RecipeStatusController {

    private final RecipeStatusService recipeStatusService;

    public RecipeStatusController(RecipeStatusService recipeStatusService) {
        this.recipeStatusService = recipeStatusService;
    }

    @GetMapping("")
    public @ResponseBody
    List<RecipeStatus> getAllRecipeStatus() {
        List<RecipeStatus> recipeStatuses = recipeStatusService.findAll();
        return recipeStatuses;

    }

}

