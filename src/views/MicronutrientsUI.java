package views;

import com.controllers.MicronutrientsCntl;
import com.controllers.Micronutrients;
import models.Potassium;
import models.Vitamins;


import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class MicronutrientsUI<PotassiumPerServing> extends JFrame {

    private JPanel micronutrientsPanel;
    private JComboBox<String> cboMicronutrients;
    private JButton btnUPdate;
    private JButton btnDelete;
    private JButton btnQuit;
    private JButton btnAdd;
    private JButton btnPrevious;
    private JTable tblScroll;
    private JButton btnNext;
    private MicronutrientsCntl micronutrientsCntl;

    private final MicronutrientsUI referringForm;


    public MicronutrientsUI() {

        referringForm = this;

        loadTable(new ArrayList<Vitamins>());
        loadMicronutrientsDropDown(new ArrayList<String>());


        JTableHeader header = tblScroll.getTableHeader();
        header.setBackground(Color.cyan);
        tblScroll = new JTable(3, 3);
        tblScroll.setRowHeight(250);
        tblScroll.setAutoCreateRowSorter(true);
        this.setContentPane(micronutrientsPanel);
        this.setSize(500, 500);
        TitledBorder titledBorder = new TitledBorder("Micronutrients");
        micronutrientsPanel.setBorder(titledBorder);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        

        tblScroll.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

               editRecord();

            }
        });


        btnAdd.addMouseListener(new MouseAdapter() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                AddMicronutrientsUI apiUI = new AddMicronutrientsUI(micronutrientsCntl, "", "", "", referringForm);
                apiUI.setVisible(true);

                System.out.println("btnAdd clicked");


            }
        });


        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    System.out.println("btnQuit clicked");
                    System.exit(0);

            }
        });


        btnUPdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Micronutrients micronutrients = new Micronutrients();
                micronutrients.setVitamins(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassium(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassiumPerServing(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());;



                System.out.println("btnUpdate clicked");


            }
        });


        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Micronutrients micronutrients = new Micronutrients();
                micronutrients.setVitamins(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassium(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassiumPerServing(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());



                System.out.println("btnDelete clicked");


            }
        });


        btnPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Micronutrients micronutrients = new Micronutrients();
                micronutrients.setVitamins(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassium(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassiumPerServing(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());

                System.out.println("btnPrevious clicked");

            }
        });


        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Micronutrients micronutrients = new Micronutrients();
                micronutrients.setVitamins(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassium(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());
                micronutrients.setPotassiumPerServing(Objects.requireNonNull(cboMicronutrients.getSelectedItem()).toString());

                System.out.println("btnNext clicked");

            }

        });
    }

    public void editRecord(){

        int selectedRow = tblScroll.getSelectedRow();

        String vitamins;
        String totalPotassium;
        String PotassiumPerServing;

        vitamins = (String)tblScroll.getValueAt(selectedRow, 0);
        totalPotassium = (String)tblScroll.getValueAt(selectedRow, 1);
        PotassiumPerServing = (String)tblScroll.getValueAt(selectedRow, 2);

        Micronutrients micronutrients = new Micronutrients();
        micronutrients.setVitamins(vitamins);
        micronutrients.setPotassium(totalPotassium);
        micronutrients.setPotassiumPerServing(PotassiumPerServing);

        AddMicronutrientsUI apiUI = new AddMicronutrientsUI(micronutrientsCntl, vitamins, totalPotassium, PotassiumPerServing, this);
        apiUI.setVisible(true);
    }


    public void loadTable(ArrayList<Vitamins> vitamins) {





             String headers[] = {"Vitamins", "totalPotassium", "PotassiumPerServings"};
             DefaultTableModel model = new DefaultTableModel();

             model.setColumnIdentifiers(headers);


             for (Vitamins vitamin : vitamins) {

                 if (vitamin.getVitaminsA().equals("Vitamins")) {
                     model.addRow(new Object[]{vitamin.getVitaminsB9(),
                             vitamin.getVitaminsC(),
                             vitamin.getVitaminsD(),
                             vitamin.getVitaminsE(), vitamin.getVitaminsK()});

                 }


             }

             tblScroll.setModel(model);


             Potassium[] potassium = new Potassium[0];
             for (Potassium potassium1 : potassium) {

                 if (potassium1.getTotalPotassium().equals("Potassium")) {
                     model.addRow(new Object[]{potassium1.getTotalPotassium(),
                             potassium1.getPotassiumPerServing()});

                 }


             }

             tblScroll.setModel(model);


        ArrayList<PotassiumPerServing> potassiumPerServing = new ArrayList<>();
        for (PotassiumPerServing pps : potassiumPerServing) {

                 if (Objects.equals(pps.toString(), "PotassiumPerServing")) {
                     model.addRow(new Object[]{pps.toString()});

                 }

             }

                tblScroll.setModel(model);





         }


        public void loadMicronutrientsDropDown(ArrayList<String> Vitamins) {


            Vitamins.add("Food Item");
            Vitamins.add("totalPotassium");
            Vitamins.add("PotassiumPerServing");
            Vitamins.add("VitaminsA");
            Vitamins.add("VitaminsB9");
            Vitamins.add("VitaminsC");
            Vitamins.add("VitaminsD");
            Vitamins.add("VitaminsE");
            Vitamins.add("VitaminsK");

            Vitamins.add(" ");
            Collections.sort(Vitamins);
            cboMicronutrients.setModel(new DefaultComboBoxModel<String>(Vitamins.toArray(new String[0])));
            //cboMicronutrients.setSelectedItem("");
            




    }

   


}




        

    


    



