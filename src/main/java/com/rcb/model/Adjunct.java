package com.rcb.model;

import com.rcb.validvalues.AdjunctType;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "adjunct")
public class Adjunct {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "date", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "supplier", columnDefinition = "CHAR(50)")
    private String supplier;

    @Column(name = "type", columnDefinition = "CHAR(15)")
    private AdjunctType type;

    @Column(name = "category", columnDefinition = "CHAR(50)")
    private String category;

    @Column(name = "extract", columnDefinition = "NUMERIC")
    private int extract;

    @Column(name = "ppg", columnDefinition = "DECIMAL")
    private BigDecimal ppg;  // potential sugar

    @Column(name = "color_lov", columnDefinition = "DECIMAL")
    private BigDecimal colorLov;

    @Column(name = "price", columnDefinition = "DECIMAL")
    private BigDecimal price;

    @Column(name = "initial_quantity", columnDefinition = "DECIMAL")
    private BigDecimal initialQuantity;

    @Column(name = "current_quantity", columnDefinition = "DECIMAL")
    private BigDecimal currentQuantity;




}
