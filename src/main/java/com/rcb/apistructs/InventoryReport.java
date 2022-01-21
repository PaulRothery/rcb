package com.rcb.apistructs;

import com.rcb.model.Grain;
import com.rcb.model.Hop;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;

@Data
@Slf4j
public class InventoryReport {

    private String type;
    private ArrayList<InventoryLine> inventoryLines = new ArrayList<>();

    public void createInventoryLine(Grain grain) {
        InventoryLine inventoryLine = new InventoryLine();
        inventoryLine.setName(grain.getName());
        inventoryLine.setInitialQuantity(grain.getInitialQuantity());
        inventoryLine.setCurrentQuantity(grain.getCurrentQuantity());
        inventoryLines.add(inventoryLine);
    }

    public void createInventoryLine(Hop hop) {
        InventoryLine inventoryLine = new InventoryLine();
        inventoryLine.setName(hop.getName());
        inventoryLine.setInitialQuantity(hop.getInitialQuantity());
        inventoryLine.setCurrentQuantity(hop.getCurrentQuantity());
        inventoryLines.add(inventoryLine);
    }
}

@Data
class InventoryLine {

    private String name;
    private BigDecimal initialQuantity;
    private BigDecimal currentQuantity;

}
