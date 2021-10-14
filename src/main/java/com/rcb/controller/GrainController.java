package com.rcb.controller;

import com.rcb.model.Grain;
import com.rcb.service.GrainService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("grain")
public class GrainController {

    private final GrainService grainService;

    public GrainController(GrainService grainService) {
        this.grainService = grainService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Grain> getAllGrain() {
        return grainService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Grain>  getGrain(@PathVariable String name) {
        List<Grain> grains = new ArrayList<>();
        Grain grain = grainService.findGrain(name);
        grains.add(grain);
        if (grain == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Grain Not Found");
        }

        return grains;
    }

    @PostMapping("")
    public @ResponseBody
    Grain createGrain(@RequestBody Grain grain) {
        grain = grainService.createGrain(grain);

        return grain;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Grain updateGrain(@PathVariable String id, @RequestBody Grain grain) {
        grain = grainService.updateGrain(id, grain);

        return grain;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteGrain(@PathVariable String name) {
       grainService.deleteGrain(name);

    }
}

