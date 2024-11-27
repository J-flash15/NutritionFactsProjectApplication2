package models;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ProteinTest {


    private final Protein pro = new Protein() {


    };


    @Test
    void getTotalProtein() {
        pro.setTotalProtein(null);
        assertNull(pro.getTotalProtein());

    }

    @Test
    void setTotalProtein() {
        pro.setTotalProtein("Chicken");
        assertEquals("Chicken", pro.getTotalProtein());

    }

    @Test
    void proteinInput() {
        String input = "Enter Total models.Protein ";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        System.setIn(in);
        Scanner test = new Scanner(System.in);
        String t1 = test.nextLine();
        assertEquals("Enter Total models.Protein ", t1);


        String input2 = "Enter models.Protein Per Servings ";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());


        System.setIn(in2);
        Scanner test2 = new Scanner(System.in);
        String t2 = test2.nextLine();
        assertEquals("Enter models.Protein Per Servings ", t2);


    }

    @Test
    void getProteinPerServings() {
        pro.setProteinPerServings(null);
        assertNull(pro.getProteinPerServings());

    }

    @Test
    void setProteinPerServings() {
        pro.setProteinPerServings("38g");
        assertEquals("38g", pro.getProteinPerServings());


    }

    @Test
    void getProteinPerServingsAsInt() {
        pro.setProteinPerServings(String.valueOf(15));
        assertEquals(15, pro.getProteinPerServingsAsInt());


    }


    @Test
    void calculateTotalProtein() {
        pro.setProteinPerServings("8");
        assertEquals(40, pro.calculateTotalProtein(5));

    }


    @Test
    void testToString() {
        Protein pro = new Protein("45g", "7", "8g",
                "20g", "5g", "15g", "5g", "4g", "10g") {

        };
        String expected = "totalProtein{ 45g proteinPerServings: 7 egg: 8g fish: 20g tofu: 5g " +
                "chicken: 15g vegetables: 5g breads: 4g pastas: 10g }";
        assertEquals(expected, pro.toString());
    }
}



