package com.rcb.controller;

import com.rcb.model.Hop;
import com.rcb.service.HopService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("hop")
public class HopController {

    private final HopService hopService;

    public HopController(HopService hopService) {
        this.hopService = hopService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Hop> getAllHop() {
        return hopService.findAll();


    }

    @GetMapping("{name}")
    public @ResponseBody
    List<Hop>  getHop(@PathVariable String name) {
        List<Hop> hops = new ArrayList<>();
        Hop hop = hopService.findHop(name);
        hops.add(hop);
        if (hop == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Hop Not Found");
        }

        return hops;
    }

    @PostMapping("")
    public @ResponseBody
    Hop createHop(@RequestBody Hop hop) {
        hop = hopService.createHop(hop);

        return hop;
    }


    @PutMapping("{id}")
    public @ResponseBody
    Hop updateHop(@PathVariable String id, @RequestBody Hop hop) {
        hop = hopService.updateHop(id, hop);

        return hop;
    }


    @DeleteMapping("{name}")
    public @ResponseBody
    void deleteHop(@PathVariable String name) {
       hopService.deleteHop(name);

    }
}

