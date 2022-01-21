package com.rcb.service;

import com.rcb.apistructs.InventoryReport;
import com.rcb.model.Grain;
import com.rcb.model.Hop;
import com.rcb.repository.GrainRepository;
import com.rcb.repository.HopRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Data
@Slf4j
public class InventoryService {

    private final GrainRepository grainRepository;
    private final HopRepository hopRepository;

    ArrayList<InventoryReport> inventoryReports;

    public InventoryService(GrainRepository grainRepository, HopRepository hopRepository) {
        this.grainRepository = grainRepository;
        this.hopRepository = hopRepository;
    }


    public ArrayList<InventoryReport> getReport() {

        inventoryReports = new ArrayList<>();


        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.setType("Grain");
        for(Grain grain : grainRepository.findAll()) {
            inventoryReport.createInventoryLine(grain);
        }
        inventoryReports.add(inventoryReport);


        inventoryReport = new InventoryReport();
        inventoryReport.setType("Hop");
        for(Hop hop : hopRepository.findAll()) {
            inventoryReport.createInventoryLine(hop);
        }
        inventoryReports.add(inventoryReport);


        return inventoryReports;
    }




}
