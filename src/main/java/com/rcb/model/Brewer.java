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


    @Column(name = "name", columnDefinition = "CHAR(20)")
    private String name;

   @Column(name = "email", columnDefinition = "CHAR(30)")
    private String email;



}
