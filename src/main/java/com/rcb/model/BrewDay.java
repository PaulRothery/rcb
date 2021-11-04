package com.rcb.model;

import lombok.Data;

import javax.persistence.*;

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
    private String mashInTime;

    @Column(name = "strike_temp_upper", columnDefinition = "INTEGER")
    private String strikeTempUpper;

    @Column(name = "strike_temp_lower", columnDefinition = "INTEGER")
    private String strikeTempLower;

    @Column(name = "strike_ph", columnDefinition = "DECIMAL")
    private String strikePh;

    @Column(name = "mash_rest_time", columnDefinition = "TIME")
    private String mashRestTime;

    @Column(name = "mash_rest_time_target", columnDefinition = "INTEGER")
    private String mashRestTimeTarget;

    @Column(name = "rest_temp", columnDefinition = "INTEGER")
    private String restTemp;

    @Column(name = "rest_temp_target", columnDefinition = "INTEGER")
    private String restTempTarget;

    @Column(name = "rest_ph", columnDefinition = "DECIMAL")
    private String restPh;

    @Column(name = "vorlauf_time", columnDefinition = "TIME")
    private String vorlaufTime;

    @Column(name = "lauter_start_time", columnDefinition = "TIME")
    private String lauterStartTime;

    @Column(name = "mash_temp", columnDefinition = "INTEGER")
    private String mashTemp;

    @Column(name = "first_gravity", columnDefinition = "DECIMAL")
    private String firstGravity;

    @Column(name = "first_ph", columnDefinition = "DECIMAL")
    private String firstPh;

    @Column(name = "lauter_end_time", columnDefinition = "TIME")
    private String lauterEndTime;

    @Column(name = "max_temp", columnDefinition = "INTEGER")
    private String maxTemp;

    @Column(name = "max_temp_target", columnDefinition = "INTEGER")
    private String maxTempTarget;

    @Column(name = "last_gravity", columnDefinition = "DECIMAL")
    private String lastGravity;

    @Column(name = "last_ph", columnDefinition = "DECIMAL")
    private String lastPh;

    @Column(name = "kettle_temp", columnDefinition = "INTEGER")
    private String kettleTemp;

    @Column(name = "boil_time", columnDefinition = "TIME")
    private String boilTime;

    @Column(name = "boil_time_target", columnDefinition = "INTEGER")
    private String boilTimeTarget;

    @Column(name = "boil_kettle_volume", columnDefinition = "DECIMAL")
    private String boilKettleVolume;

    @Column(name = "boil_kettle_volume_target", columnDefinition = "DECIMAL")
    private String boilKettleVolumeTarget;

    @Column(name = "pre_boil_gravity", columnDefinition = "DECIMAL")
    private String preBoilGravity;

    @Column(name = "pre_boil_gravity_target", columnDefinition = "DECIMAL")
    private String preBoilGravityTarget;

    @Column(name = "pre_boil_ph", columnDefinition = "DECIMAL")
    private String preBoilPh;

    @Column(name = "koppa_clear", columnDefinition = "DECIMAL")
    private String koppaClear;

    @Column(name = "zinc_grams", columnDefinition = "DECIMAL")
    private String zincGrams;

    @Column(name = "flame_out_time", columnDefinition = "TIME")
    private String flamOutTime;

    @Column(name = "flame_kettle_volume", columnDefinition = "DECIMAL")
    private String flameKettleVolume;

    @Column(name = "flame_kettle_volume_target", columnDefinition = "DECIMAL")
    private String flameKettleVolumeTarget;

    @Column(name = "original_gravity", columnDefinition = "DECIMAL")
    private String originalGravity;

    @Column(name = "original_gravity_target", columnDefinition = "DECIMAL")
    private String originalGravityTarget;

    @Column(name = "post_boil_ph", columnDefinition = "DECIMAL")
    private String postBoilPh;

    @Column(name = "whirlpool_time", columnDefinition = "TIME")
    private String whirlpoolTime;

    @Column(name = "knockout_time", columnDefinition = "TIME")
    private String knockoutTime;

    @Column(name = "end_knockout_time", columnDefinition = "TIME")
    private String endKnockoutTime;

    @Column(name = "knockout_temp", columnDefinition = "INTEGER")
    private String knockoutTemp;

    @Column(name = "knockout_temp_target", columnDefinition = "INTEGER")
    private String knockoutTempTarget;

    @Column(name = "pitch_time", columnDefinition = "TIME")
    private String pitchTime;

    @Column(name = "ferm_temp", columnDefinition = "INTEGER")
    private String fermTemp;

    @Column(name = "ferm_temp_target", columnDefinition = "INTEGER")
    private String fermTempTarget;


}
