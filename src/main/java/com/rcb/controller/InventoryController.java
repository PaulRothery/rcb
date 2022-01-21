package com.rcb.controller;

import com.rcb.apistructs.InventoryReport;
import com.rcb.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("")
    public @ResponseBody
    ArrayList<InventoryReport> getReport() {
        return inventoryService.getReport();

    }


}

