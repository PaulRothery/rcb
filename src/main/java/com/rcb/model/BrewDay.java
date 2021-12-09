package com.rcb.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rcb.utils.TimeHandler;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

/*
    This table has a one to one relationship with the recipe. It contains
    all of the values that will be filled in on the brew day along with
    some target values
 */
@Data
@Entity
@Table(name = "brewday")
public class BrewDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "recipe_id", columnDefinition = "BIGINT")
    private Long recipeId;

    @Column(name = "mash_in_time", columnDefinition = "TIME")
    @JsonDeserialize(using = TimeHandler.class)
    private LocalTime mashInTime;

    @Column(name = "strike_temp_upper", columnDefinition = "DECIMAL")
    private Double strikeTempUpper;

    @Column(name = "strike_temp_lower", columnDefinition = "DECIMAL")
    private Double strikeTempLower;

    @Column(name = "strike_ph", columnDefinition = "DECIMAL")
    private Double strikePh;

    @Column(name = "mash_rest_time", columnDefinition = "TIME")
    private Time mashRestTime;

    @Column(name = "mash_rest_time_target", columnDefinition = "INTEGER")
    private Integer mashRestTimeTarget;

    @Column(name = "rest_temp", columnDefinition = "DECIMAL")
    private Double restTemp;

    @Column(name = "rest_temp_target", columnDefinition = "DECIMAL")
    private Double restTempTarget;

    @Column(name = "rest_ph", columnDefinition = "DECIMAL")
    private Double restPh;

    @Column(name = "vorlauf_time", columnDefinition = "TIME")
    private Time vorlaufTime;

    @Column(name = "lauter_start_time", columnDefinition = "TIME")
    private Time lauterStartTime;

    @Column(name = "mash_temp", columnDefinition = "DECIMAL")
    private Double mashTemp;

    @Column(name = "first_gravity", columnDefinition = "DECIMAL")
    private Double firstGravity;

    @Column(name = "first_ph", columnDefinition = "DECIMAL")
    private Double firstPh;

    @Column(name = "lauter_end_time", columnDefinition = "TIME")
    private LocalTime lauterEndTime;

    @Column(name = "max_temp", columnDefinition = "DECIMAL")
    private Double maxTemp;

    @Column(name = "max_temp_target", columnDefinition = "DECIMAL")
    private Double maxTempTarget;

    @Column(name = "last_gravity", columnDefinition = "DECIMAL")
    private Double lastGravity;

    @Column(name = "last_ph", columnDefinition = "DECIMAL")
    private Double lastPh;

    @Column(name = "kettle_temp", columnDefinition = "DECIMAL")
    private Double kettleTemp;

    @Column(name = "boil_time", columnDefinition = "TIME")
    private Time boilTime;

    @Column(name = "boil_time_target", columnDefinition = "INTEGER")
    private Integer boilTimeTarget;

    @Column(name = "boil_kettle_volume", columnDefinition = "DECIMAL")
    private Double boilKettleVolume;

    @Column(name = "boil_kettle_volume_target", columnDefinition = "DECIMAL")
    private Double boilKettleVolumeTarget;

    @Column(name = "pre_boil_gravity", columnDefinition = "DECIMAL")
    private Double preBoilGravity;

    @Column(name = "pre_boil_gravity_target", columnDefinition = "DECIMAL")
    private Double preBoilGravityTarget;

    @Column(name = "pre_boil_ph", columnDefinition = "DECIMAL")
    private Double preBoilPh;

    @Column(name = "koppa_clear", columnDefinition = "DECIMAL")
    private Double koppaClear;

    @Column(name = "zinc_grams", columnDefinition = "DECIMAL")
    private Double zincGrams;

    @Column(name = "flame_out_time", columnDefinition = "TIME")
    private Time flameOutTime;

    @Column(name = "flame_kettle_volume", columnDefinition = "DECIMAL")
    private Double flameKettleVolume;

    @Column(name = "flame_kettle_volume_target", columnDefinition = "DECIMAL")
    private Double flameKettleVolumeTarget;

    @Column(name = "original_gravity", columnDefinition = "DECIMAL")
    private Double originalGravity;

    @Column(name = "original_gravity_target", columnDefinition = "DECIMAL")
    private Double originalGravityTarget;

    @Column(name = "post_boil_ph", columnDefinition = "DECIMAL")
    private Double postBoilPh;

    @Column(name = "whirlpool_staet_time", columnDefinition = "TIME")
    private Time whirlpoolStartTime;

    @Column(name = "whirlpool_end_time", columnDefinition = "TIME")
    private Time whirlpoolEndTime;

    @Column(name = "knockout_start_time", columnDefinition = "TIME")
    private Time knockoutStartTime;

    @Column(name = "knockout_end_time", columnDefinition = "TIME")
    private LocalTime knockoutEndTime;

    @Column(name = "knockout_temp", columnDefinition = "DECIMAL")
    private Double knockoutTemp;

    @Column(name = "knockout_temp_target", columnDefinition = "DECIMAL")
    private Double knockoutTempTarget;


    @Column(name = "ferm_temp", columnDefinition = "DECIMAL")
    private Double fermTemp;

    @Column(name = "ferm_temp_target", columnDefinition = "DECIMAL")
    private Double fermTempTarget;

    @Column(name = "fermentor_vessel", columnDefinition = "CHAR(20)")
    private String fermenterVessel;

    @Column(name = "pitch_time", columnDefinition = "TIME")
    private LocalTime pitchTime;

    @Column(name = "pitch_volume", columnDefinition = "DECIMAL")
    private Double pitchVolume;

    @Column(name = "yeast_strain", columnDefinition = "CHAR(20)")
    private String yeastStrain;

    @Column(name = "previous_batch_id", columnDefinition = "CHAR(20)")
    private String previousBatchId;

    @Column(name = "previous_batch_brand", columnDefinition = "CHAR(50)")
    private String previousBatchBramd;

    @Column(name = "yeast_vessel", columnDefinition = "CHAR(20)")
    private String yeastVessel;

    @Column(name = "cell_count", columnDefinition = "DECIMAL")
    private Double cellCount;

    @Column(name = "viability", columnDefinition = "DECIMAL")
    private Double viability;



}
