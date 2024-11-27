package models;

import com.controllers.Calories;

public class TestHarness {
    // TestHarness class to test the Calories, Protein, and Printable classes
    public TestHarness() {
        testCaloriesClass();
        testProteinClass();
        testPrintableClass();

    }
    // testPrintableClass method to test the Printable class
    public void testPrintableClass() {

        System.out.println("Testing the models.Printable class");
        Printable printable = new Printable() {
            @Override
            public void printSetup() {

            }

            @Override
            public void print() {

            }
        };


    }
    // testProteinClass method to test the Protein class
    public void testProteinClass() {

        System.out.println("Testing the models.Protein class ");
        Protein p1 = new Protein() {

        };

        if (p1 != null) { // if statement to check if the object is not null
            System.out.println(p1.getTotalProtein());
            System.out.println(p1.getProteinPerServings());


        } else
            System.out.println("There was a error creating the models.Protein class"); // print error message
        p1.setTotalProtein("ChickenBreast\n"); // set the total protein

        p1.setProteinPerServings("31 Grams of protein"); // set the protein per servings

        System.out.println(p1.toString()); // print the object


    }

    // testCaloriesClass method to test the Calories class
    public void testCaloriesClass() {

        System.out.println("Testing the  com.controllers.Calories class "); // print message
        Calories c1 = new Calories(); // create a new object of the Calories class

        if (c1 != null) { // if statement to check if the object is not null
            System.out.println(c1.getTotalCalories()); // print the total calories
            System.out.println(c1.getCaloriesPerServings()); // print the calories per servings
        } else
            System.out.println("There was a error creating the protein class "); // print error message

        c1.setTotalCalories("Mixed Of different food"); // set the total calories
        c1.setCaloriesPerServings("Depend on the gender amd the amount and how active you are "); // set the calories per servings

        System.out.println(c1.toString()); 


    }

}


