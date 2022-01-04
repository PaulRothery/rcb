package com.rcb.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rcb.utils.DateHandler;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "recipeadjunct", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class RecipeAdjunct {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "date", columnDefinition = "DATE")
    @JsonDeserialize(using = DateHandler.class)
    private Date date;

    @Column(name = "name", columnDefinition = "CHAR(50)")
    private String name;

    @Column(name = "quantity", columnDefinition = "DECIMAL")
    private BigDecimal quantity;

}
