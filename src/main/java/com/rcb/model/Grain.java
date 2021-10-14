package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "grain")
public class Grain {


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

    @Column(name = "sack_weight", columnDefinition = "DECIMAL")
    private BigDecimal sackWeight;

    @Column(name = "moisture_content", columnDefinition = "DECIMAL")
    private BigDecimal moistureContent;

    @Column(name = "fgdb", columnDefinition = "DECIMAL")
    private BigDecimal fgdb;

    @Column(name = "protein_content", columnDefinition = "DECIMAL")
    private BigDecimal proteinContent;

    @Column(name = "color", columnDefinition = "DECIMAL")
    private BigDecimal color;

    @Column(name = "diastatic_power", columnDefinition = "DECIMAL")
    private BigDecimal diastaticPower;

    @Column(name = "base_price", columnDefinition = "DECIMAL")
    private BigDecimal basePrice;

    @Column(name = "milling_price", columnDefinition = "DECIMAL")
    private BigDecimal millingPrice;

    @Column(name = "shipping_price", columnDefinition = "DECIMAL")
    private BigDecimal shippingPrice;


}
