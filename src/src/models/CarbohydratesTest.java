package models;

import com.controllers.Carbohydrates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CarbohydratesTest {
 
    // Instance variables
    private final Carbohydrates carbs = new Carbohydrates() {

    };


    @Test 
    void getTotalCarbs() {
        carbs.setNetCarbs("Fiber and Sugar alcohols"); 
        assertEquals("Fiber and Sugar alcohols", carbs.getNetCarbs());

    }

      
    @Test
    void setTotalCarbs() {
        carbs.setTotalCarbs("Vegetable");
        assertEquals("Vegetable", carbs.getTotalCarbs());
    }

    @Test
    void getNetCarbs() {
        carbs.setNetCarbs(null);
        assertNull(carbs.getNetCarbs());


    }

    @Test
    void setNetCarbs() {
        carbs.setTotalCarbs("450gPasta");
        assertEquals("450gPasta", carbs.getTotalCarbs());


    }

    @Test
    void getComplexCarbs() {
        carbs.setComplexCarbs(null);
        assertNull(carbs.getComplexCarbs());
    }

    @Test
    void setComplexCarbs() {
        carbs.setComplexCarbs("Broccoli");
        assertEquals("Broccoli", carbs.getComplexCarbs());
    }

    @Test
    void testToString() {
        Carbohydrates carbs = new Carbohydrates(" 300g ", " 45g ", " 65g", "2g") {

        };
        String expected = "totalCarbs {  300g netCarbs:  45g complexCarbs:  65g  Fruits: 2g }";
        assertEquals(expected, carbs.toString());

    }


}

