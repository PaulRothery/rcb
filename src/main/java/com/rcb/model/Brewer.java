package com.rcb.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "brewer", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class Brewer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private String recipeId;

    @Column(name = "name", columnDefinition = "CHAR(20)")
    private String name;



}
