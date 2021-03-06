package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "yeast")
public class Yeast {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "strain", columnDefinition = "CHAR(50)")
    private String strain;

    @Column(name = "date", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "supplier", columnDefinition = "CHAR(50)")
    private String supplier;

    @Column(name = "lot_number", columnDefinition = "CHAR(50)")
    private String lotNumber;

    @Column(name = "brand", columnDefinition = "CHAR(20)")
    private String brand;

    @Column(name = "previous_batch_id", columnDefinition = "BIGINT")
    private int previousBatchId;

    @Column(name = "previous_batch_brand", columnDefinition = "CHAR(20)")
    private String previousBatchBrand;

    @Column(name = "generation", columnDefinition = "NUMERIC")
    private int generation;               // # times batch has been used

    @Column(name = "cell_count", columnDefinition = "NUMERIC")
    private int cellCount;               // # cells per milliliter

    @Column(name = "viability", columnDefinition = "DECIMAL")
    private BigDecimal viability;        // % of living cells

    @Column(name = "quantity", columnDefinition = "DECIMAL")
    private BigDecimal quantity;


}
