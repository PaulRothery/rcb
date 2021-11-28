package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

/**
 * Recipe model
 *
 * Contains the recipe fields and relationships to the assoviated tables
 * There are 3 fields that are calculated and therefore not represented
 * in the model:
 *
 *  original gravity
 *  target ibus
 *  target color
 */
@Data
@Entity
@Table(name = "recipe", uniqueConstraints = {@UniqueConstraint(columnNames = "recipe_id")})
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "status", columnDefinition = "CHAR(20)")
    private String status;

    @Column(name = "batch_id", columnDefinition = "CHAR(20)")
    private String batchId;

     @Column(name = "sub_batch_id", columnDefinition = "CHAR(20)")
    private String subBatchId;

    @Column(name = "previous_batch_id", columnDefinition = "CHAR(20)")
    private String previousBatchId;

    @Column(name = "date", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "estimated_duration", columnDefinition = "INT")
    private int estimatedDuration;

    @Column(name = "type", columnDefinition = "CHAR(20)")
    private String type;

    @Column(name = "batch_yield", columnDefinition = "DECIMAL")
    private BigDecimal batchYield;

    @Column(name = "target_eff", columnDefinition = "DECIMAL")
    private BigDecimal targetEff;

    @Column(name = "description", columnDefinition = "CHAR(50)")
    private BigDecimal description;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<RecipeGrain> recipeGrains;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<RecipeHop> recipeHops;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<RecipeAdjunct> recipeAdjuncts;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<RecipeBrewer> recipeBrewers;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    private Set<BrewDay> brewDay;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<BrewLog> brewLogs;

}
