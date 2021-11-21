package com.rcb.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

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

    @Column(name = "batch_no", columnDefinition = "CHAR(20)")
    private String batchNo;

     @Column(name = "sub_batch_no", columnDefinition = "CHAR(20)")
    private String subBatchNo;

    @Column(name = "previous_batch_no", columnDefinition = "CHAR(20)")
    private String previousBatchNo;

    @Column(name = "date", columnDefinition = "DATE")
    private Date date;

    @Column(name = "type", columnDefinition = "CHAR(20)")
    private String type;

    @Column(name = "batch_yield", columnDefinition = "DECIMAL")
    private BigDecimal batchYield;

    @Column(name = "target_og", columnDefinition = "DECIMAL")
    private BigDecimal targetOG;

    @Column(name = "target_eff", columnDefinition = "DECIMAL")
    private BigDecimal targetEff;

    @Column(name = "target_ibus", columnDefinition = "DECIMAL")
    private BigDecimal targetIbus;

    @Column(name = "target_color", columnDefinition = "DECIMAL")
    private BigDecimal targetColor;

    @Column(name = "yeast_vessel", columnDefinition = "CHAR(20)")
    private BigDecimal yeastVessel;

    @Column(name = "fermentor_vessel", columnDefinition = "CHAR(20)")
    private BigDecimal fermenterVessel;

    @Column(name = "pitch_volume", columnDefinition = "DECIMAL")
    private BigDecimal pitchVolume;

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
    private Set<RecipeYeast> recipeYeasts;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<RecipeAdjunct> recipeAdjuncts;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<Brewer> brewers;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    private Set<BrewDay> brewDay;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    @OrderBy("id")
    private Set<BrewLog> brewLogs;

}
