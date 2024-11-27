package models;

import com.controllers.Micronutrients;

import java.io.Serializable;


// Potassium is a child class of Micronutrients and implements Printable and Serializable
public class Potassium extends Micronutrients implements Printable, Serializable {
    
    // Instance variables
    private String totalPotassium, potassiumPerServing;

    private String hulkBanner;

   // Constructor
    public Potassium(String totalPotassium, String potassiumPerServing) {
        super(totalPotassium, potassiumPerServing);
        this.totalPotassium = totalPotassium;
        this.potassiumPerServing = potassiumPerServing;
    }

    // Default Constructor
    public Potassium() {

        totalPotassium = "totalPotassium";
        potassiumPerServing = "potassiumPerServing";

    }

    // potassiumImport method
    public void potassiumImport() {

        System.out.println("models.Potassium: is an essential mineral that helps " +
                "the body function properly in many ways, including");
    }

    // Getters and Setters
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


    @Override
    public String toString() {
        return "models.Potassium{" +
                "totalPotassium=" + totalPotassium +
                "potassiumPerServing=" + potassiumPerServing +
                '}';
    }


    public void printSetup() {

        hulkBanner = "******************************** models.Potassium ********************************";
    }

    public void print() {

        System.out.println(hulkBanner);
        System.out.println(this);
    }

}
