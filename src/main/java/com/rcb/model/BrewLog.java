package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "brewlog")
public class BrewLog {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "date_time", columnDefinition = "TIMESTAMP")
    private Timestamp dateTime;

    @Column(name = "temp", columnDefinition = "DECIMAL")
    private BigDecimal temp;

    @Column(name = "gravity", columnDefinition = "DECIMAL")
    private BigDecimal gravity;

    @Column(name = "ph", columnDefinition = "DECIMAL")
    private BigDecimal ph;

    @Column(name = "name", columnDefinition = "CHAR(20)")
    private String name;

    @Column(name = "note", columnDefinition = "CHAR(100)")
    private String note;
}
