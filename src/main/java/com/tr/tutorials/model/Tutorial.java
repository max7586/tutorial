package com.tr.tutorials.model;

import javax.persistence.*;

@Entity
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name="duration_in_month")
    private int durationInMonth;
    private int level;
    private float fee;

    public Tutorial() {};



    public Tutorial(int id, String name, int durationInMonth, int level, float fee) {
        this.id = id;
        this.name = name;
        this.durationInMonth = durationInMonth;
        this.level = level;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(int durationInMonth) {
        this.durationInMonth = durationInMonth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", durationInMonth=" + durationInMonth +
                ", level=" + level +
                ", fee=" + fee +
                '}';
    }
}
