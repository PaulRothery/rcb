package com.rcb.controller;

import com.rcb.model.Adjunct;
import com.rcb.service.AdjunctService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("adjunct")
public class AdjunctController {

    private final AdjunctService adjunctService;

    public AdjunctController(AdjunctService adjunctService) {
        this.adjunctService = adjunctService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Adjunct> getAllAdjunctFermentable() {
        return adjunctService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Adjunct>  getAdjunctFermentable(@PathVariable String name) {
        List<Adjunct> adjuncts = new ArrayList<>();
        Adjunct adjunct = adjunctService.findAdjunctFermentable(name);
        adjuncts.add(adjunct);
        if (adjunct == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Adjunct Not Found");
        }

        return adjuncts;
    }

    @PostMapping("")
    public @ResponseBody
    Adjunct createAdjunctFermentable(@RequestBody Adjunct adjunct) {
        adjunct = adjunctService.createAdjunctFermentable(adjunct);

        return adjunct;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Adjunct updateAdjunctFermentable(@PathVariable String id, @RequestBody Adjunct adjunct) {
        adjunct = adjunctService.updateAdjunctFermentable(id, adjunct);

        return adjunct;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteAdjunctFermentable(@PathVariable String name) {
       adjunctService.deleteAdjunctFermentable(name);

    }
}

