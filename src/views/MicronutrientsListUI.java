package views;

import javax.swing.event.AncestorListener;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionEvent;

public class MicronutrientsListUI {
    private JPanel tablePanel;
    private JTable MicronutrientsTableModel;
    private JPanel buttonPanel;




    public MicronutrientsListUI() {
        tablePanel.addAncestorListener(new addButtonListener());
        MicronutrientsTableModel.addAncestorListener(null);
        buttonPanel.addAncestorListener(null);


    }



    public static class addButtonListener implements AncestorListener {
        public void actionPerformed(ActionEvent e) {
            // Your action performed code here

        }

        @Override
        public void ancestorAdded(AncestorEvent event) {
            // Your ancestor added code here
        }

        @Override
        public void ancestorRemoved(AncestorEvent event) {
            // Your ancestor removed code here
        }

        @Override
        public void ancestorMoved(AncestorEvent event) {
            // Your ancestor moved code here
        }




      
    }



}


