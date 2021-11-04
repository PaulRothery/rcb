package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "recipegrain", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class RecipeGrain {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "quantity", columnDefinition = "DECIMAL")
    private BigDecimal quantity;

}
