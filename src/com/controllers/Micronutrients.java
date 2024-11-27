package com.controllers;


// Micronutrients class
public class Micronutrients extends MicronutrientsList {
     
    // Instance variables
    protected String vitaminsA, vitaminsC, vitaminsD,
            vitaminsE, vitaminsK, vitaminsB9;

    protected String totalPotassium, potassiumPerServing;


    // Constructor
    public Micronutrients(String vitaminsA, String vitaminsC, String vitaminsD, String vitaminsE, String vitaminsK, String vitaminsB9, String totalPotassium, String potassiumPerServing) {
        this.vitaminsA = vitaminsA;
        this.vitaminsC = vitaminsC;
        this.vitaminsD = vitaminsD;
        this.vitaminsE = vitaminsE;
        this.vitaminsK = vitaminsK;
        this.vitaminsB9 = vitaminsB9;
        this.totalPotassium = totalPotassium;
        this.potassiumPerServing = potassiumPerServing;
    }


    // Default Constructor
    public Micronutrients() {
        totalPotassium = "totalPotassium";
        potassiumPerServing = "potassiumPerServing";
        vitaminsA = "vitaminsA";
        vitaminsC = "vitaminsC";
        vitaminsD = "vitaminsD";
        vitaminsE = "vitaminsE";
        vitaminsK = "vitaminsK";
        vitaminsB9 = "vitaminsB9";
    }
    
    // micronutrients method
    public Micronutrients(String vitaminB, int i, int i1) {


    }
    
    public Micronutrients(String totalPotassium, String potassiumPerServing) {

    }

    public Micronutrients(String vitaminsA, String vitaminsC, String vitaminsD, String vitaminsB9, String vitaminsK, String vitaminsE) {
    }

      
    public void micronutrientsImport() { 

        System.out.println("These nutrients are mostly vitamins and minerals, " + 
                "and are usually measured in milligrams (mg) or micrograms (mcg)"); 

    } 

    // Getters and Setters
    public String getVitaminsA() { 
        return vitaminsA;
    }

    public void setVitaminsA(String vitaminsA) {
        this.vitaminsA = vitaminsA;
    }

    public String getVitaminsC() {
        return vitaminsC;
    }

    public void setVitaminsC(String vitaminC) {
        this.vitaminsC = vitaminC;
    }

    public String getVitaminsD() {
        return vitaminsD;
    }

    public void setVitaminsD(String vitaminD) {
        this.vitaminsD = vitaminD;
    }

    public String getVitaminsE() {
        return vitaminsE;
    }

    public void setVitaminsE(String vitaminE) {
        this.vitaminsE = vitaminE;
    }

    public String getVitaminsK() {
        return vitaminsK;
    }

    public void setVitaminsK(String vitaminK) {
        this.vitaminsK = vitaminK;
    }

    public String getVitaminsB9() {
        return vitaminsB9;
    }

    public void setVitaminsB9(String vitaminB9) {
        this.vitaminsB9 = vitaminB9;
    }

    public String getTotalPotassium() {
        return totalPotassium;
    }

    public void setTotalPotassium(String totalPotassium) {
        this.totalPotassium = totalPotassium;
    }

    public String getPotassiumPerServing() {
        return potassiumPerServing;
    }

    public void setPotassiumPerServing(String potassiumPerServing) {
        this.potassiumPerServing = potassiumPerServing;
    }

    

    // toString method
    @Override
    public String toString() {
        return "com.controllers.Micronutrients{" +
                ", totalPotassium='" + totalPotassium + '\'' +
                ", potassiumPerServing='" + potassiumPerServing + '\'' +
                '}';
    }


    // printSetup method
    public void forEach(Object o) {
    }
     
   
    public int size() {

        return size();
    }

    public void forEach() {
    }

    
    public void setVitamins(String text) {
    }

    public void setPotassium(String text) {
    }

    public Object getPotassium() {
        return null;
    }

    public int getName() {
        return 0;
    }
}
