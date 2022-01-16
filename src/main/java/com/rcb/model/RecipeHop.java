package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "recipehop", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class RecipeHop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "date", columnDefinition = "DATE")
   // @JsonDeserialize(using = DateHandler.class)
    private Date date;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "quantity", columnDefinition = "DECIMAL")
    private BigDecimal quantity;

    @Column(name = "time", columnDefinition = "INT")
    private BigDecimal time;


}
