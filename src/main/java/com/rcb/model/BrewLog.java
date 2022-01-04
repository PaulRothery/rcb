package com.rcb.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rcb.utils.DateHandler;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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

    @Column(name = "date", columnDefinition = "DATE")
    @JsonDeserialize(using = DateHandler.class)
    private Date date;

    @Column(name = "time", columnDefinition = "DATE")
    private String time;

    @Column(name = "temp", columnDefinition = "DECIMAL")
    private BigDecimal temp;

    @Column(name = "gravity", columnDefinition = "DECIMAL")
    private BigDecimal gravity;

    @Column(name = "ph", columnDefinition = "DECIMAL")
    private BigDecimal ph;

    @Column(name = "brewer", columnDefinition = "CHAR(20)")
    private String brewer;

    @Column(name = "note", columnDefinition = "CHAR(100)")
    private String note;
}
