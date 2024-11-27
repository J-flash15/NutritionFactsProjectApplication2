package models;


import com.controllers.Micronutrients;
import com.controllers.MicronutrientsList;

import javax.swing.table.AbstractTableModel;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

// MicronutrientsTableModel class
public class MicronutrientsTableModel extends AbstractTableModel {
    
    // Instance variables
    private final String[] columnNames = {"Vitamins", "totalPotassium", "PotassiumPerServings"}; // column names
    private final List<Micronutrients> micronutrients;

    /**
     * @param micronutrients
     */ 

     // MicronutrientsTableModel constructor
    public MicronutrientsTableModel(List<Micronutrients> micronutrients) {

        this.micronutrients = micronutrients;

    }
    /**
     * @return
     */
    @Override
    public int getRowCount() {
        return micronutrients.size();
    }

    /**
     * @return
     */
    @Override
    public int getColumnCount() {

        return columnNames.length;
    }



    /**
     * @param rowIndex
     * @param columnIndex
     * @return
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // get the value at the specified row and column
        MicronutrientsList micronutrients1 = micronutrients.get(rowIndex); // get the micronutrients at the specified row

        switch (columnIndex) { // switch statement
            case 0: return micronutrients1.getVitamins();  
            case 1: return micronutrients1.getTotalPotassium();
            case 2: return micronutrients1.getPotassiumPerServings();
        
             default: return null;
        }


    }
    
  
    /**
     * @param column
     * @return
     */
    @Override
    public String getColumnName(int column) { // get the column name
        return columnNames[column];
    }


} 



