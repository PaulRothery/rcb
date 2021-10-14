package com.rcb.controller;

import com.rcb.model.AdjunctFermentable;
import com.rcb.service.AdjunctFermentableService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("adjunct-fermentable")
public class AdjunctFermentableController {

    private final AdjunctFermentableService adjunctFermentableService;

    public AdjunctFermentableController(AdjunctFermentableService adjunctFermentableService) {
        this.adjunctFermentableService = adjunctFermentableService;
    }

    @GetMapping("")
    public @ResponseBody
    List<AdjunctFermentable> getAllAdjunctFermentable() {
        return adjunctFermentableService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<AdjunctFermentable>  getAdjunctFermentable(@PathVariable String name) {
        List<AdjunctFermentable> adjunctFermentables = new ArrayList<>();
        AdjunctFermentable adjunctFermentable = adjunctFermentableService.findAdjunctFermentable(name);
        adjunctFermentables.add(adjunctFermentable);
        if (adjunctFermentable == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AdjunctFermentable Not Found");
        }

        return adjunctFermentables;
    }

    @PostMapping("")
    public @ResponseBody
    AdjunctFermentable createAdjunctFermentable(@RequestBody AdjunctFermentable adjunctFermentable) {
        adjunctFermentable = adjunctFermentableService.createAdjunctFermentable(adjunctFermentable);

        return adjunctFermentable;
    }


    @PutMapping("{id}")
    public @ResponseBody
    AdjunctFermentable updateAdjunctFermentable(@PathVariable String id, @RequestBody AdjunctFermentable adjunctFermentable) {
        adjunctFermentable = adjunctFermentableService.updateAdjunctFermentable(id, adjunctFermentable);

        return adjunctFermentable;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteAdjunctFermentable(@PathVariable String name) {
       adjunctFermentableService.deleteAdjunctFermentable(name);

    }
}

