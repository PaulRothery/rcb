package com.rcb.controller.enums;

import com.rcb.service.enums.SaltService;
import com.rcb.validvalues.Salt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("salt")
public class SaltController {

    private final SaltService saltService;

    public SaltController(SaltService saltService) {
        this.saltService = saltService;
    }

    @GetMapping("")
    public @ResponseBody
    List<Salt> getAllSalt() {
        List<Salt> salts = saltService.findAll();
        return salts;

    }

}

