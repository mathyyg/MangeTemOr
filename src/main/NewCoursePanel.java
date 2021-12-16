/*
 * Created by JFormDesigner on Wed Dec 15 17:35:00 CET 2021
 */

package main;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Mathys Gagner
 */
public class NewCoursePanel extends JPanel {
    public NewCoursePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mapPanel1 = new MapPanel();
        panel1 = new JPanel();
        buttonNewCourse = new JButton();
        buttonValider = new JButton();
        buttonReinitialiser = new JButton();
        buttonAnnuler = new JButton();

        //======== this ========
        setLayout(new BorderLayout());
        add(mapPanel1, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]"));

            //---- buttonNewCourse ----
            buttonNewCourse.setText("Nouvelle course");
            panel1.add(buttonNewCourse, "cell 0 0");

            //---- buttonValider ----
            buttonValider.setText("Valider la course");
            panel1.add(buttonValider, "cell 1 0");

            //---- buttonReinitialiser ----
            buttonReinitialiser.setText("R\u00e9initialiser le trajet");
            panel1.add(buttonReinitialiser, "cell 2 0");

            //---- buttonAnnuler ----
            buttonAnnuler.setText("Annuler");
            buttonAnnuler.setEnabled(false);
            panel1.add(buttonAnnuler, "cell 3 0");
        }
        add(panel1, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        buttonReinitialiser.setEnabled(false);
        buttonValider.setEnabled(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public MapPanel mapPanel1;
    public JPanel panel1;
    public JButton buttonNewCourse;
    public JButton buttonValider;
    public JButton buttonReinitialiser;
    public JButton buttonAnnuler;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
