/*
 * Created by JFormDesigner on Thu Dec 16 18:49:21 CET 2021
 */

package main;

import javax.swing.*;
import net.miginfocom.swing.*;

import java.text.DecimalFormat;

/**
 * @author Mathys Gagner
 */
public class EtatCourseFrame extends JFrame {
    private final Course course;
    private final String name;

    public EtatCourseFrame(Course course, String name) {
        this.course = course;
        this.name = name;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        labelNomCourse = new JLabel();
        poids = new JLabel();
        tpsRest = new JLabel();
        distRest = new JLabel();
        label4 = new JLabel();
        progressBar1 = new JProgressBar();
        labelPourcentage = new JLabel();

        //======== this ========
        setTitle("\u00c9tat de la course");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,alignx center",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        contentPane.add(labelNomCourse, "cell 1 0");

        //---- poids ----
        poids.setText("Poids de la livraison: ");
        contentPane.add(poids, "cell 1 2");

        //---- tpsRest ----
        tpsRest.setText("Temps restant: ");
        contentPane.add(tpsRest, "cell 1 4");

        //---- distRest ----
        distRest.setText("Distance restante: ");
        contentPane.add(distRest, "cell 1 6");

        //---- label4 ----
        label4.setText("Avancement:");
        contentPane.add(label4, "cell 0 8");
        contentPane.add(progressBar1, "cell 1 8");
        contentPane.add(labelPourcentage, "cell 2 8");
        setSize(295, 230);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        course.addIteration();

        labelNomCourse.setText(name);
        poids.setText(poids.getText()+"5 kg");
        double tempsEstime = course.getDistanceKm() / course.getSpeed() * 60;
        double tempsRestant = course.getDistanceKm() / course.getSpeed() * 60;
        double distanceRestante = course.getDistanceKm();
        String minutes = "minute";

        if(course.getNbiterations() == 0) {

            if(tempsRestant > 0) {
                minutes += "s";
            }
            tpsRest.setText(tpsRest.getText() + Math.round(tempsRestant) + minutes);
            distRest.setText(distRest.getText() + new DecimalFormat("###.##").format(distanceRestante) + " km");
            labelPourcentage.setText("0%");
        }
        else {
            if(tempsRestant > 0) {
                minutes += "s";
            }
            distanceRestante -= course.getSpeed() * course.getNbiterations()/60;
            tempsRestant -= distanceRestante / course.getSpeed() * 60;
            tpsRest.setText(tpsRest.getText() + Math.round(tempsEstime - tempsRestant) + minutes);
            distRest.setText(distRest.getText() + new DecimalFormat("###.##").format(distanceRestante) + " km");
            int progress = (int) (100- (distanceRestante/course.getDistanceKm() * 100));
            System.out.println(distanceRestante);
            System.out.println(course.getDistanceKm());
            System.out.println("progress: "+progress);
            System.out.println(tempsRestant);
            progressBar1.setValue(progress);
            labelPourcentage.setText(progress + "%");
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JLabel labelNomCourse;
    public JLabel poids;
    public JLabel tpsRest;
    public JLabel distRest;
    private JLabel label4;
    public JProgressBar progressBar1;
    public JLabel labelPourcentage;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
