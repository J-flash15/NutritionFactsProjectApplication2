package com.controllers;

import models.Printable;

public class Calories extends Macronutrients implements Printable {
    private String totalCalories, caloriesPerServings;

    private String madBanner;
    

    // Constructor
    public Calories(String totalCalories, String caloriesPerServings) {

        super(totalCalories, caloriesPerServings);
        this.totalCalories = totalCalories;
        this.caloriesPerServings = caloriesPerServings;
    }
     
    // Default Constructor
    public Calories() {

        totalCalories = "totalCalories";
        caloriesPerServings = "caloriesPerServings";

    }
      
    // caloriesImport method
    public void caloriesImport() {

        System.out.println("com.controllers.Calories are important because " +
                "they provide the body with the energy it needs to function properly");
    }

    // Getters and Setters
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

    // toString method
    @Override
    public String toString() {
        return "com.controllers.Calories{" + "totalCalories='" + totalCalories + '\'' + ",caloriesPerServings='" + caloriesPerServings + '\'' + '}';
    }

    // printSetup method
    public void printSetup() {

        madBanner = "******************************** com.controllers.Calories ********************************";
    }
      // print method
    public void print() {

        System.out.println(madBanner);
        System.out.println(this);
    }
}
