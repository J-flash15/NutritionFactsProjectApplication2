package com.controllers;

import models.Printable;


// Carbohydrates class
public class Carbohydrates extends Macronutrients implements Printable {

    // Instance variables
    private String totalCarbs, netCarbs, complexCarbs, Fruits;
    private String strongBanner;
    
    // Constructor
    public Carbohydrates(String totalCarbs, String netCarbs, String complexCarbs, String Fruits) {
        super(totalCarbs, netCarbs, complexCarbs, Fruits);
        this.totalCarbs = totalCarbs;
        this.netCarbs = netCarbs;
        this.complexCarbs = complexCarbs;
        this.Fruits = Fruits;

    }
     // Default Constructor
    public Carbohydrates() {

        totalCarbs = "totalCarbs";
        netCarbs = "netCarbs";
        complexCarbs = "complexCarbs";
        Fruits = "Fruits";

    }

    // CarbohydratesImport method
    public void CarbohydratesImport() {

        System.out.println("com.controllers.Carbohydrates are crucial for providing " +
                "the body's primary source of energy, " +
                "particularly for the brain and nervous system");
    }

    // Getters and Setters
    public String getFruits() {
        return Fruits;
    }

    public void setFruits(String fruits) {
        Fruits = fruits;
    }

    public String getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(String totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public String getNetCarbs() {
        return netCarbs;
    }

    public void setNetCarbs(String netCarbs) {
        this.netCarbs = netCarbs;
    }

    public String getComplexCarbs() {
        return complexCarbs;
    }

    public void setComplexCarbs(String complexCarbs) {
        this.complexCarbs = complexCarbs;
    }


    @Override
    public String toString() {
        return "totalCarbs { " + getTotalCarbs()
                + "netCarbs: " + getNetCarbs() + "complexCarbs: "
                + getComplexCarbs() + "  Fruits: " + getFruits() + " }";
    }
    
    // printSetup method
    public void printSetup() {

        strongBanner = "******************************** com.controllers.Carbohydrates ********************************";

    }

    // print method
    public void print() {

        System.out.println(strongBanner);
        System.out.println(this);
    }

}
