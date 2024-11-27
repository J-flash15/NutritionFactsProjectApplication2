package views;

import java.awt.*;
import java.util.List;

import com.controllers.Micronutrients;
import models.MicronutrientsTableModel;

import javax.swing.*;

import java.util.ArrayList;

public class MicronutrientsDetailUI {


    public static void main(String[] args) {;

        List<Micronutrients>  mList = new ArrayList<>();


        mList.add(new Micronutrients("  ", "  "));
        System.out.println();

        mList.add(new Micronutrients());

        mList.add(new Micronutrients());

        mList.add(new Micronutrients());

        mList.add(new Micronutrients());

        MicronutrientsTableModel micronutrientsTableModel = new MicronutrientsTableModel(mList);


        JTable table = new JTable(micronutrientsTableModel);
        JScrollPane scrollPane = new JScrollPane(table);


        JFrame frame = new JFrame("Micronutrients");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo( null);
        frame.setVisible(true);







        


        
    }


}
