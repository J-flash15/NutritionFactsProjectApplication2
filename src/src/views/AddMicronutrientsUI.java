package views;

import com.controllers.MicronutrientsCntl;

import com.controllers.Micronutrients;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMicronutrientsUI extends JFrame {
    private JPanel AddMicronutrients;
    private JTextField txtVitamins;
    private JTextField txtPotassium;
    private JTextField txtPotassiumPS;
    public JButton btnSave;
    public JButton btnCancel;
    public JButton btnDelete;
    private JLabel labelVitamins;
    private JLabel totalPotassium;
    private JLabel perservingsPotassium;
    private JPanel panelMicronutrients;
    private MicronutrientsCntl micronutrientsCntl;
    private MicronutrientsUI formUI;
    private AddMicronutrientsUI thisForm;
    private int Vitamins;
    private MicronutrientsUI referringForm;


    public AddMicronutrientsUI ( MicronutrientsCntl micronutrientsCntl, String vitamins, String potassium, String potassiumPS, MicronutrientsUI referringForm) {
        this.micronutrientsCntl = micronutrientsCntl;
        this.referringForm = referringForm;
        thisForm = this;
        setContentPane(AddMicronutrients);
        setLocationRelativeTo(referringForm);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);




        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVitamins.setText("");
                txtPotassium.setText("");
                txtPotassiumPS.setText("");

                System.out.println("Delete button clicked");
            }
        });



        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thisForm.setVisible(false);
                referringForm.setVisible(true);

                System.out.println("Cancel button clicked");
            }
        });


        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Micronutrients micronutrients = new Micronutrients();
                micronutrients.setVitamins(txtVitamins.getText());
                micronutrients.setPotassium(txtPotassium.getText());
                micronutrients.setPotassiumPerServing(txtPotassiumPS.getText());


                System.out.println("Save button clicked");
            }
        });


    }


}




