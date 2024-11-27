package com.controllers;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

public class MicronutrientsList {

    //private ArrayList<Micronutrients> micronutrientsList;

    private LinkedList<MicronutrientsItem> micronutrientsList;

    public MicronutrientsList() {
        micronutrientsList = new LinkedList<>();
        buildTestData();
        printItems();

       // micronutrientsList = new ArrayList<>();
    }

    public void buildTestData() {
        micronutrientsList.add(new MicronutrientsItem("Vitamin A", 100));
        micronutrientsList.add(new MicronutrientsItem("Vitamin B9", 200));
        micronutrientsList.add(new MicronutrientsItem("Vitamin C", 300));
        micronutrientsList.add(new MicronutrientsItem("Vitamin D", 400));
        micronutrientsList.add(new MicronutrientsItem("Vitamin E", 500));
        micronutrientsList.add(new MicronutrientsItem("Vitamin K", 600));
    }



    public void addItems(MicronutrientsItem newItem) {
        ListIterator<MicronutrientsItem> iterator = micronutrientsList.listIterator();
        while (iterator.hasNext()) {
            int comparison = iterator.next().compareTo(newItem);
            if (iterator.next().compareTo(newItem) > 0) {
                iterator.previous();
                return;
            } else if (comparison == 0) {
                System.out.println(newItem.getName() + " is already on the list");
                return;
            }
           
         
        }
        iterator.add(newItem);
        
    }

    public void removeItem(String name) {
        MicronutrientsItem item = itemToRemove(name);
        if (item != null) {
            micronutrientsList.remove(item);
        } else {
            System.out.println(name + " not found in the list");
        }
    }

    private MicronutrientsItem itemToRemove(String name) {
        for (MicronutrientsItem item : micronutrientsList) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public MicronutrientsItem getItem (String searchTerm) {
        for (MicronutrientsItem item : micronutrientsList) {
            if (item.getName().equals(searchTerm)) {
                return item;
            }
        }
        return null;
    }


    public void printItems() {
        for (MicronutrientsItem item : micronutrientsList) {
            System.out.println(item);
        }
    }



    
    // public void addMicronutrients(Micronutrients micronutrients) { // add micronutrients to the list
    //     micronutrientsList.add(micronutrients);
    // }

    // public ArrayList<Micronutrients> getMicronutrientsList() { // get the list of micronutrients
    //     return micronutrientsList;
    // }

    // public void setMicronutrientsList(ArrayList<Micronutrients> micronutrientsList) { // set the list of micronutrients
    //     this.micronutrientsList = micronutrientsList;
    // }
 
    // // printMicronutrientsList method

    // public void printMicronutrientsList() {
    //     if (micronutrientsList.isEmpty()) { // check if the list is empty
    //         System.out.println("The list is empty"); // print message if the list is empty
    //     } else {
    //         for (Micronutrients micronutrients : micronutrientsList) { // loop through the list
    //             System.out.println(micronutrients);


    //         }
    //     }
    // }

     
    // public void removeMicronutrients(Micronutrients micronutrients) { // remove micronutrients from the list
    //     micronutrientsList.remove(micronutrients);
    // }

    // public void removeMicronutrients(int index) { // remove micronutrients from the list
    //     micronutrientsList.remove(index);


    // }

    // public int size() {
    //     return micronutrientsList.size(); // get the size of the list


    // }


    public Object getPotassiumPerServings() { // get the potassium per servings

        return 0;
    }

    public Object getTotalPotassium() { // get the total potassium
        
        return "Vitamins Data";

        
    }

    public Object getVitamins() { // get the vitamins
        return "Vitamins Data";
    }
}





