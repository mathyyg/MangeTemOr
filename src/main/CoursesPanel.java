/*
 * Created by JFormDesigner on Wed Dec 15 19:45:50 CET 2021
 */

package main;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Mathys Gagner
 */
public class CoursesPanel extends JPanel {
    public CoursesPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        newCoursePanel1 = new NewCoursePanel();
        panel1 = new JPanel();
        nextIte = new JButton();
        etatCourse = new JButton();

        //======== this ========
        setLayout(new BorderLayout());
        add(newCoursePanel1, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3,alignx center",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]"));

            //---- nextIte ----
            nextIte.setText("Prochaine it\u00e9ration (+1 minute)");
            panel1.add(nextIte, "cell 0 0");

            //---- etatCourse ----
            etatCourse.setText("\u00c9tat de la course");
            panel1.add(etatCourse, "cell 1 0");
        }
        add(panel1, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public NewCoursePanel newCoursePanel1;
    public JPanel panel1;
    public JButton nextIte;
    public JButton etatCourse;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
