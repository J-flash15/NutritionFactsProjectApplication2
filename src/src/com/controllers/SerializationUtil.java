package com.controllers;

import models.Vitamins;
import models.Potassium;

import java.io.*;
import java.util.ArrayList;


public class SerializationUtil {
     
    // serializeVitamins method accepts an ArrayList of Vitamins and a String as parameters
    public static void serializeVitamins(ArrayList<Vitamins> vitamins, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName); // create a new FileOutputStream object
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // create a new ObjectOutputStream object
            out.writeObject(vitamins);
            //out.close();// close the ObjectOutputStream object
            //fileOut.close(); // close the FileOutputStream object
            System.out.println("Serialized data is saved in " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
      // serializePotassium method accepts a Potassium object and a String as parameters
    public static void serializePotassium(Potassium potassium, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(potassium);
           // out.close(); // close the ObjectOutputStream object
            //fileOut.close(); // close the FileOutputStream object
            System.out.println("Serialized data is saved in " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }



}


