package com.pogostats.entity;

import javax.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POKEDEX_NUMBER")
    private Integer pokedexNumber;

    @Column(name = "TYPE_1")
    private String type1;

    @Column(name = "TYPE_2")
    private String type2;

    @Column(name = "MAX_PC")
    private Integer maxPc;

    @Column(name = "ATK")
    private Integer atk;

    @Column(name = "DEF")
    private Integer def;

    @Column(name = "STA")
    private Integer sta;

    @Column(name = "REGION")
    private String region;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(Integer pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Integer getMaxPc() {
        return maxPc;
    }

    public void setMaxPc(Integer maxPc) {
        this.maxPc = maxPc;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getSta() {
        return sta;
    }

    public void setSta(Integer sta) {
        this.sta = sta;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}