package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "hop")
public class Hop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "date", columnDefinition = "DATE")
    private Date date;

    @Column(name = "supplier", columnDefinition = "CHAR(50)")
    private String supplier;

    @Column(name = "lot_number", columnDefinition = "CHAR(50)")
    private String lotNumber;

    @Column(name = "crop_year", columnDefinition = "NUMERIC")
    private int cropYear;

    @Column(name = "price", columnDefinition = "DECIMAL")
    private BigDecimal price;

    @Column(name = "alpha", columnDefinition = "DECIMAL")
    private BigDecimal alpha;

    @Column(name = "initial_quantity", columnDefinition = "DECIMAL")
    private BigDecimal initial_quantity;

    @Column(name = "current_quantity", columnDefinition = "DECIMAL")
    private BigDecimal current_quantity;


}
