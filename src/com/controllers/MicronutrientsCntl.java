package com.controllers;


import models.Vitamins;
import views.MicronutrientsUI;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JButton;

// MicronutrientsCntl class
public class MicronutrientsCntl<FoodItem> {

    // Instance variables
    private ArrayList<Vitamins> micronutrients;
    private JTextArea txtArea;
    private final MicronutrientsList micronutrientsList;
    private final MicronutrientsUI micronutrientsUI;
    private String fileName;
 


    // Constructor
    public MicronutrientsCntl(ArrayList<Vitamins> micronutrients, JTextArea txtArea) {


        micronutrientsList = new MicronutrientsList();
        micronutrientsUI = new MicronutrientsUI();
        micronutrientsUI.setVisible(true);
        this.micronutrients = micronutrients;
        this.txtArea = txtArea;


//        System.out.println("com.controllers.Micronutrients list initialized with " + micronutrientsList.size() + " items.");
    }

    // Default Constructor
//    public ArrayList<Micronutrients> getMicronutrientsList() {
//
//        return micronutrientsList.getMicronutrientsList();
//
//    }
//
//    public void setMicronutrientsList(ArrayList<Micronutrients> micronutrientsList) {
//        this.micronutrientsList.setMicronutrientsList(micronutrientsList);
//    }
//
//
//    public void addMicronutrients(Micronutrients micronutrients) {
//        micronutrientsList.addMicronutrients(micronutrients);
//    }
//
//    public void removeMicronutrients(Micronutrients micronutrients) {
//        micronutrientsList.removeMicronutrients(micronutrients);
//    }
//
//    public void removeMicronutrients(int index) {
//        micronutrientsList.removeMicronutrients(index);
//    }
//
//    public int size() {
//        return micronutrientsList.size();
//    }


      //savedata method which writes the data to a file and saves it
    public void saveData(ArrayList<Vitamins> micronutrients, String fileName) {
        this.fileName = fileName;

        JTextArea txtArea = new JTextArea("Writing to a file");
        JButton btnAdd;
        JButton btnPrevious;
        JButton btnNext;
        JButton btnDelete;
        btnAdd = new JButton("Add");
        btnPrevious = new JButton("Previous");
        btnNext = new JButton("Next");
        btnDelete = new JButton("Delete");


        btnDelete.addActionListener(e -> {
            txtArea.append("Button clicked");
        });

        btnPrevious.addActionListener(e -> {
            txtArea.append("Button clicked");
        });

        btnNext.addActionListener(e -> {
            txtArea.append("Button clicked");
        });


        btnAdd.addActionListener(e -> {
            txtArea.append("Button clicked");
        });

       

        // Create a new file
        try {
            File data = new File(fileName);
            if (data.createNewFile()) {
                System.out.println("File created: " + data.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String filePath = txtArea.getText();

        // Write the data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("Writing to a file");
            writer.newLine();

            //writer.close();

            for (Vitamins micronutrient : micronutrients) {
                writer.write(micronutrient.getVitamins() + ", " + micronutrient.getPotassium() + ", " + micronutrient.getPotassiumPerServing());
                writer.newLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());


        }

    }

    // loadVitaminData method which reads the data from a file and loads it
    public ArrayList<Vitamins> loadVitaminData(String fileName) throws IOException {

        ArrayList<Vitamins> vitamins = new ArrayList<Vitamins>();

        try {

            BufferedReader myReader = new BufferedReader(new FileReader(fileName));

            //myReader.close();
            System.out.println("File loaded successfully");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return vitamins;
        
    }
     
    // displayDataInTextArea method which displays the data in the JTextArea
    public void displayDataInTextArea() {
        txtArea.setText(" ");
        for (Vitamins vitamins : micronutrients) {
            txtArea.append(vitamins.getVitamins() + ", " + vitamins.getPotassium() + ", " + vitamins.getPotassiumPerServing() + "\n");
        }
    }




}




