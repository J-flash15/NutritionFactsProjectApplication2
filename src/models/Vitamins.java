package models;

import com.controllers.Micronutrients;

import java.io.Serializable;

// Vitamins is a child class of Micronutrients and implements Printable and Serializable
public class Vitamins extends Micronutrients implements Printable, Serializable {

    // Instance variables
    private String vitaminsA, vitaminsC, vitaminsD,
            vitaminsE, vitaminsK, vitaminsB9;

    private String bruceBanner;

    // Constructor
    public Vitamins(String vitaminsA, String vitaminsB9,
                    String vitaminsC, String vitaminsK, String vitaminsE,
                    String vitaminsD) {

         // super is a keyword to call the parent class constructor
        super(vitaminsA, vitaminsC, vitaminsD, vitaminsB9, vitaminsK, vitaminsE); 

        this.vitaminsA = vitaminsA;
        this.vitaminsB9 = vitaminsB9;
        this.vitaminsC = vitaminsC;
        this.vitaminsD = vitaminsD;
        this.vitaminsE = vitaminsE;
        this.vitaminsK = vitaminsK;


    }



    public Vitamins() {

        

    }
     // vitaminsImport method and printSetup method
    public void vitaminsImport() {

        System.out.println("models.Vitamins: are essential nutrients " +
                "that help the body grow, develop, and function properly");
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

    public void setVitaminsC(String vitaminsC) {
        this.vitaminsC = vitaminsC;
    }

    public String getVitaminsD() {
        return vitaminsD;
    }

    public void setVitaminsD(String vitaminsD) {
        this.vitaminsD = vitaminsD;
    }

    public String getVitaminsE() {
        return vitaminsE;
    }

    public void setVitaminsE(String vitaminsE) {
        this.vitaminsE = vitaminsE;
    }

    public String getVitaminsK() {
        return vitaminsK;
    }

    public void setVitaminsK(String vitaminsK) {
        this.vitaminsK = vitaminsK;
    }

    public String getVitaminsB9() {
        return vitaminsB9;
    }

    public void setVitaminsB9(String vitaminsB9) {
        this.vitaminsB9 = vitaminsB9;
    }

   // toString method and print method
    @Override
    public String toString() {

        return "vitamins{" + "vitaminsA: " + getVitaminsA() + "vitamins: " + getVitaminsC()
                + "vitaminsD: " + getVitaminsD() + "vitaminsE: " + getVitaminsE() +
                "vitaminsK: " + getVitaminsK() + "vitaminsB9: " + getVitaminsB9() + '}';
    }
     
    // printSetup method 
    public void printSetup() {

        bruceBanner = "******************************** models.Vitamins ********************************";


    }


    public void print() {

        System.out.println(bruceBanner);
        System.out.println(this);

    }


}
