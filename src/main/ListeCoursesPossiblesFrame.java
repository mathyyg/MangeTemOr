/*
 * Created by JFormDesigner on Fri Dec 17 15:16:13 CET 2021
 */

package main;

import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Mathys Gagner
 */
public class ListeCoursesPossiblesFrame extends JFrame {
    private final Entreprise entreprise;

    public ListeCoursesPossiblesFrame(Entreprise entreprise) {
        this.entreprise = entreprise;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle("Liste des courses possibles");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Voici les meilleures combinaisons Employ\u00e9/V\u00e9hicule pour une course de 5kg sur 3km:");
        contentPane.add(label1, "cell 0 0");

        //---- label2 ----
        label2.setText("(avec les v\u00e9hicules actuellement disponibles, ");
        contentPane.add(label2, "cell 0 1");

        //---- label3 ----
        label3.setText("la premi\u00e8re ligne du tableau correspond \u00e0 la combinaison la plus optimale)");
        contentPane.add(label3, "cell 0 2");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "Employ\u00e9", "V\u00e9hicule", "CO2 \u00e9mis", "Prix"
                }
            ));
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, "cell 0 3");
        setSize(520, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table1.setDefaultRenderer(Object.class, centerRenderer);

        ArrayList<Course> coursesPossibles = new ArrayList<>();
        for(Salaree sa : entreprise.getEmploye()) {
            for (Vehicule ve : entreprise.getGa().getVehiculesDispo()) {
                try {
                    Course course = new Course(5, sa, ve);
                    coursesPossibles.add(course);
                } catch(CourseImpossibleException ex) {}
            }
        }

        Collections.sort(coursesPossibles, Collections.reverseOrder());
        System.out.println(coursesPossibles.toString());

        for(Course co : coursesPossibles) {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.addRow(new Object[]{co.getSalaree().getName(), co.getVehicule().getName(), co.getCo2EmisSimulation() + " g", new DecimalFormat("###.###").format(co.getPrixSimulation()) + " €"});
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
