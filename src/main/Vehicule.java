package main;

import java.util.*;

public abstract class Vehicule { //superclass vehicule

    protected String name;
    protected double price;
    protected double speed;
    protected double co2;
    protected double weight;
    protected double usingPrice;
    protected static double sp98price;

    public Vehicule(String s, double p, double sp, double c, double w, double up) {
        this.name = s;
        this.price = p;
        this.speed = sp;
        this.co2 = c;
        this.weight = w;
        this.usingPrice = up;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getUsingPrice() {
        return usingPrice;
    }

    public void setUsingPrice(double usingPrice) {
        this.usingPrice = usingPrice;
    }
}