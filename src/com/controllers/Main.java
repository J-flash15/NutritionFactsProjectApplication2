//Shamar J Gordon 
//Micronutrients Project
//Due Date: 11/17/2024
//Course: IST 261 Section 001
//Instructor: 
package com.controllers;

import java.util.ArrayList;

import models.Vitamins;
import views.MicronutrientsUI;
import models.*;

import javax.swing.*;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {


        // Create an instance of the MicronutrientsList class
        MicronutrientsList micronutrientsList = new MicronutrientsList();


        MicronutrientsItem newItem = new MicronutrientsItem("Vitamin A", 100);
        micronutrientsList.addItems(newItem);
        System.out.println("Added " + newItem.getName() + " to the list");
        micronutrientsList.printItems();


        MicronutrientsItem itemToRemove = micronutrientsList.getItem("Vitamin B9");
        micronutrientsList.removeItem(itemToRemove.getName());
        System.out.println("Removed " + itemToRemove.getName() + " from the list");
        micronutrientsList.printItems();


        MicronutrientsItem itemToFind = micronutrientsList.getItem("Vitamin C");
        System.out.println("Found " + itemToFind.getName() + " in the list");


         
        //Create a JTextArea to display the list of vitamins
         JTextArea txtArea = new JTextArea();
       
      //List of vitamins to be displayed in the JTextArea
     ArrayList<Vitamins> Vitamins = new ArrayList<>();
        
         //Create a new instance of the MicronutrientsCntl class
         MicronutrientsCntl micronutrientsCntl = new MicronutrientsCntl(Vitamins, txtArea);
         ArrayList<Vitamins> loadedVitamins = micronutrientsCntl.loadVitaminData("micronutrients.txt");
         Vitamins.addAll(loadedVitamins);
        
         //Create a new instance of the MicronutrientsUI class
//         MicronutrientsUI micronutrientsUI = new MicronutrientsUI();
//         micronutrientsUI.setVisible(true);



         //Save the list of vitamins to a file
         micronutrientsCntl.saveData(Vitamins, "micronutrients.txt");
         micronutrientsCntl.displayDataInTextArea();



        // Serialize the vitamins and potassium objects
        SerializationUtil.serializeVitamins(Vitamins, "vitamins.ser");
        Vitamins newVitamins = new Vitamins("healthy skin", "red blood cells", "immune system ",
                "blood coagulate normally ", "molecules ", "phosphorus");
                Vitamins.add(newVitamins);
        Potassium potassium = new Potassium("mg ", "1 medium");
        SerializationUtil.serializePotassium(potassium, "potassium.ser");




                // // Create an instance of the Carbohydrates, Calories, Vitamins, Potassium, and Protein classes
                // Carbohydrates c1 = new Carbohydrates("g ", "25g ", "5g ", "g"); 
                // Calories c2 = new Calories("g", "1");
                // Vitamins v1 = new Vitamins("healthy skin", "red blood cells", "immune system ",
                //         "blood coagulate normally ", "molecules ", "phosphorus");
                // Potassium p2 = new Potassium("mg ", "1 medium");
                // Protein p1 = new Protein("g", "4g", "6g", "8g",
                //         "5g", "10g", "5g", "4g", "8g");
        
        
                // // Create an array list of micronutrients 
                // ArrayList<Micronutrients> micronutrientsList = new ArrayList<>();
                // micronutrientsList.add(v1);
                // micronutrientsList.add(p2);
        
        
                // for (Micronutrients micronutrients : micronutrientsList) {
        
                //     System.out.println(micronutrients);
                // }
        
                //  // Create an array list of macronutrients
                // ArrayList<Macronutrients> macronutrientsList = new ArrayList<>();
                // macronutrientsList.add(c2);
                // macronutrientsList.add(c1);
                // macronutrientsList.add(p1);
        
                //  // Print the macronutrients
                // for (Macronutrients macronutrients : macronutrientsList) {
        
                //     System.out.println(macronutrients);
                // }
        
                // // Create an array list of printable objects
                // ArrayList<Printable> printableObjects = new ArrayList<>();
                // printableObjects.add(v1);
                // printableObjects.add(p1);
                // printableObjects.add(p2);
                // printableObjects.add(c1);
                // printableObjects.add(c2);
        
        
                // for (Printable p : printableObjects) { // Print the printable objects
                //     p.printSetup();
                //     p.print();
                // }
                 
                // // Import the data from the text files
                // Macronutrients mymacronutrients = new Macronutrients();
                // mymacronutrients.macronutrientsImport();
        


                // Micronutrients mymicronutrients = new Micronutrients(); 
                // mymicronutrients.micronutrientsImport();
        
          
                // Vitamins myvitamins = new Vitamins();
                // myvitamins.vitaminsImport();
        
        
                // Potassium mypotassium = new Potassium();
                // mypotassium.potassiumImport();
        
        
                // Calories mycalories = new Calories();
                // mycalories.caloriesImport();
        
                // Protein myprotein = new Protein();
                // myprotein.proteinImport();
        
        
                // Carbohydrates mycarbohydrates = new Carbohydrates();
                // mycarbohydrates.CarbohydratesImport();
        
        
                // Protein protein = new Protein();
        
                // protein.proteinInput();
                // System.out.println(protein);
                  
                // // Create a scanner object to read the user input
                // try (Scanner scanner = new Scanner(System.in)) {
                //     System.out.println("Enter the amount of servings: ");
                //     int amountOfServings = scanner.nextInt();
        
                //     int totalProtein = protein.calculateTotalProtein(amountOfServings);
        
                //     System.out.println("Total protein: " + amountOfServings + " Serving: " + totalProtein);
                // }
                
        
        
    }


        

}
