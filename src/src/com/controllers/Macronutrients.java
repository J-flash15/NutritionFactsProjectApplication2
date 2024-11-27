package com.controllers;

public class Macronutrients {

    private String totalProtein, proteinPerServings;

    private String totalCarbs;
    private String netCarbs;
    private String complexCarbs;
    private String fruits;

    private String totalCalories, caloriesPerServings;


    public Macronutrients(String totalCalories, String caloriesPerServings) {

        this.totalCalories = totalCalories;
        this.caloriesPerServings = caloriesPerServings;
    }


    public Macronutrients(String totalCarbs, String netCarbs, String complexCarbs, String fruits) {
        this.totalCarbs = totalCarbs;
        this.netCarbs = netCarbs;
        this.complexCarbs = complexCarbs;
        this.fruits = fruits;
    }


    public Macronutrients() {

        totalProtein = "totalProtein";
        proteinPerServings = "proteinPerServings";
        totalCarbs = "totalCarbs";
        netCarbs = "netCarbs";
        complexCarbs = "complexCarbs";


    }


    public void macronutrientsImport() {

        System.out.println("These nutrients provide energy and are usually measured in grams");
    }


    public String getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(String totalProtein) {
        this.totalProtein = totalProtein;
    }

    public String getProteinPerServings() {
        return proteinPerServings;
    }

    public void setProteinPerServings(String proteinPerServings) {
        this.proteinPerServings = proteinPerServings;
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


    public String getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(String totalCalories) {
        this.totalCalories = totalCalories;
    }

    public String getCaloriesPerServings() {
        return caloriesPerServings;
    }

    public void setCaloriesPerServings(String caloriesPerServings) {
        this.caloriesPerServings = caloriesPerServings;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "com.controllers.Macronutrients{" +
                "totalProtein='" + totalProtein + '\'' +
                ", proteinPerServings='" + proteinPerServings + '\'' +
                ", totalCarbs='" + totalCarbs + '\'' +
                ", netCarbs='" + netCarbs + '\'' +
                ", complexCarbs='" + complexCarbs + '\'' +
                ", fruits='" + fruits + '\'' +
                ", totalCalories='" + totalCalories + '\'' +
                ", caloriesPerServings='" + caloriesPerServings + '\'' +
                '}';
    }
}



