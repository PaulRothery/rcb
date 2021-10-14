package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "adjunct_fermentable")
public class AdjunctFermentable {


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






}
