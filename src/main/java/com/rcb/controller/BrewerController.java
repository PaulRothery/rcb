package com.rcb.controller;

import com.rcb.model.Brewer;
import com.rcb.service.BrewerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("brewer")
public class BrewerController {

    private final BrewerService brewerService;

    public BrewerController(BrewerService brewerService) {
        this.brewerService = brewerService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Brewer> getAllBrewer() {
        return brewerService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Brewer>  getBrewer(@PathVariable String name) {
        List<Brewer> brewers = new ArrayList<>();
        Brewer brewer = brewerService.findBrewer(name);
        brewers.add(brewer);
        if (brewer == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Brewer Not Found");
        }

        return brewers;
    }

    @PostMapping("")
    public @ResponseBody
    Brewer createBrewer(@RequestBody Brewer brewer) {
        brewer = brewerService.createBrewer(brewer);

        return brewer;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Brewer updateBrewer(@PathVariable String id, @RequestBody Brewer brewer) {
        brewer = brewerService.updateBrewer(id, brewer);

        return brewer;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteBrewer(@PathVariable String name) {
       brewerService.deleteBrewer(name);

    }
}

