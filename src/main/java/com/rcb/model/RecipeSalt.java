package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "recipesalt", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class RecipeSalt {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "mash_quantity", columnDefinition = "DECIMAL")
    private BigDecimal mashQuantity;

    @Column(name = "lauter_quantity", columnDefinition = "DECIMAL")
    private BigDecimal lauterQuantity;

    @Column(name = "kettle_quantity", columnDefinition = "DECIMAL")
    private BigDecimal kettleQuantity;

}
