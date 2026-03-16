package com.premierLeague.premierZone.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // this entity ensures that this player will get mapped to player in db
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name="name",unique = true)
    private String name;// any error in datatype means different datatype in our csv
    private String Nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk;
    private Double crdY; // card yellow
    private Double crdR; //card red
    private Double xg; // expected goals
    private Double xag;
    private String Team;

    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdY, Double crdR, Double xg, Double xag, String team) {
        this.name = name;
        Nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdY = crdY;
        this.crdR = crdR;
        this.xg = xg;
        this.xag = xag;
        Team = team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public void setCrdR(Double crdR) {
        this.crdR = crdR;
    }

    public void setCrdY(Double crdY) {
        this.crdY = crdY;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return Nation;
    }

    public String getPos() {
        return pos;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMin() {
        return min;
    }

    public Double getGls() {
        return gls;
    }

    public Double getAst() {
        return ast;
    }

    public Double getPk() {
        return pk;
    }

    public Double getCrdY() {
        return crdY;
    }

    public Double getCrdR() {
        return crdR;
    }

    public Double getXg() {
        return xg;
    }

    public Double getXag() {
        return xag;
    }

    public String getTeam() {
        return Team;
    }

}
