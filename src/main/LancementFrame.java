/*
 * Created by JFormDesigner on Wed Dec 15 13:39:10 CET 2021
 */

package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Mathys Gagner
 */
public class LancementFrame extends JFrame {
    private Entreprise entreprise;
    private Timer labelColor;

    public LancementFrame(Entreprise e) {
        initComponents();
        this.entreprise = e;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mateo Esteves
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setTitle("MangeTem'Or");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- button1 ----
        button1.setIcon(new ImageIcon(getClass().getResource("/Start-icon.png")));
        button1.setText("Lancer l'application");
        button1.setPreferredSize(new Dimension(173, 45));
        contentPane.add(button1, "cell 1 0 2 1");

        //---- label1 ----
        label1.setText("R\u00e9alis\u00e9 par Mateo Esteves & Thomas Douillard");
        contentPane.add(label1, "cell 0 1 3 1,align center center,grow 0 0");

        //---- label2 ----
        label2.setText("Les Infopotes \u00a9 ");
        contentPane.add(label2, "cell 1 2,alignx center,growx 0");
        setSize(350, 140);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextFrame();
            }
        });
        Color[] colorTable = new Color[]{Color.red, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.blue, Color.MAGENTA, Color.black,
                Color.gray,Color.darkGray,Color.pink,Color.cyan};
        labelColor = new Timer(200,e -> setMadeBy(colorTable[ThreadLocalRandom.current().nextInt(0,10)]));
        labelColor.start();
    }

    public void setMadeBy(Color color) { label2.setForeground(color); labelColor.start();}

    public void nextFrame() {
        MainFrame mainFrame = new MainFrame(entreprise);
        mainFrame.setVisible(true);
        dispose();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mateo Esteves
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
