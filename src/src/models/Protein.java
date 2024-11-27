package models;

import com.controllers.Macronutrients;

import java.util.Scanner;

// Protein is a child class of Macronutrients and implements Printable
public class Protein extends Macronutrients implements Printable {
    private String totalProtein, proteinPerServings, egg, fish, tofu, chicken;
    private String vegetables, breads, pastas;

    private String SmartBanner;

    // Constructor
    public Protein(String totalProtein, String proteinPerServings, String egg,
                   String fish, String tofu, String chicken,
                   String vegetables, String breads, String pastas) {

        // super keyword is used to call the constructor of the parent class
        super(totalProtein, proteinPerServings);
        this.totalProtein = totalProtein;
        this.proteinPerServings = proteinPerServings;
        this.egg = egg;
        this.fish = fish;
        this.tofu = tofu;
        this.chicken = chicken;
        this.vegetables = vegetables;
        this.breads = breads;
        this.pastas = pastas;

    }

    public Protein() {

    }


    public void proteinImport() {

        System.out.println("A deficiency or excess of protein can lead to disease," +
                "including nervous system defects, metabolic problems, organ failure, and even death. ");


    }

     // Getters and Setters
    public String getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(String totalProtein) {
        this.totalProtein = totalProtein;
    }

    public void proteinInput() {
        Scanner p1 = new Scanner(System.in);

        System.out.println("Enter total models.Protein: ");
        this.totalProtein = p1.nextLine();

        System.out.println("Enter models.Protein Per Servings: ");
        this.proteinPerServings = p1.nextLine();
    }

    public String getProteinPerServings() {
        return proteinPerServings;
    }

    public void setProteinPerServings(String proteinPerServings) {
        this.proteinPerServings = proteinPerServings;
    }

    public int getProteinPerServingsAsInt() {

        return Integer.parseInt(proteinPerServings);
    }

    public int calculateTotalProtein(int amountOfServings) {

        return getProteinPerServingsAsInt() * amountOfServings;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getBreads() {
        return breads;
    }

    public void setBreads(String breads) {
        this.breads = breads;
    }

    public String getPastas() {
        return pastas;
    }

    public void setPastas(String pastas) {
        this.pastas = pastas;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getTofu() {
        return tofu;
    }

    public void setTofu(String tofu) {
        this.tofu = tofu;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

   // toString method, which gives a string representation of the object
    @Override
    public String toString() {
        return "totalProtein{ " + totalProtein +
                " proteinPerServings: " + proteinPerServings +
                " egg: " + egg +
                " fish: " + fish +
                " tofu: " + tofu +
                " chicken: " + chicken +
                " vegetables: " + vegetables +
                " breads: " + breads +
                " pastas: " + pastas + " }";
    }
   

    // printSetup method
    public void printSetup() {


        SmartBanner = "******************************** models.Protein *********************************";


    }

    // print method
    public void print() {

        System.out.println(SmartBanner);
        System.out.println(this);

    }

}
