package com.rcb.controller;

import com.rcb.model.Yeast;
import com.rcb.service.YeastService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("yeast")
public class YeastController {

    private final YeastService yeastService;

    public YeastController(YeastService yeastService) {
        this.yeastService = yeastService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Yeast> getAllYeast() {
        return yeastService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Yeast>  getYeast(@PathVariable String name) {
        List<Yeast> yeasts = new ArrayList<>();
        Yeast yeast = yeastService.findYeast(name);
        yeasts.add(yeast);
        if (yeast == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Yeast Not Found");
        }

        return yeasts;
    }

    @PostMapping("")
    public @ResponseBody
    Yeast createYeast(@RequestBody Yeast yeast) {
        yeast = yeastService.createYeast(yeast);

        return yeast;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Yeast updateYeast(@PathVariable String id, @RequestBody Yeast yeast) {
        yeast = yeastService.updateYeast(id, yeast);

        return yeast;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteYeast(@PathVariable String name) {
       yeastService.deleteYeast(name);

    }
}

