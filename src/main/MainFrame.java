/*
 * Created by JFormDesigner on Wed Dec 15 14:19:14 CET 2021
 */

package main;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;


/**
 * @author Les Infopotes
 */
public class MainFrame extends JFrame {
    private Entreprise entreprise;

    public MainFrame(Entreprise e) {
        this.entreprise = e;
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mateo Esteves
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menuItem2 = new JMenuItem();
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        panel2 = new JPanel();
        vSpacer1 = new JPanel(null);
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        panel4 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label5 = new JLabel();
        textField1 = new JTextField();
        label8 = new JLabel();
        textField10 = new JTextField();
        label11 = new JLabel();
        textField12 = new JTextField();
        label6 = new JLabel();
        textField2 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        label12 = new JLabel();
        textField11 = new JTextField();
        label10 = new JLabel();
        textField8 = new JTextField();
        panel1 = new JPanel();
        scrollPane4 = new JScrollPane();
        list1 = new JList();
        button6 = new JButton();
        label1 = new JLabel();
        textField5 = new JTextField();
        label2 = new JLabel();
        textField6 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        button5 = new JButton();

        //======== this ========
        setTitle("MangeTem'Or");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Fichier");

                //---- menuItem1 ----
                menuItem1.setText("Quitter");
                menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK));
                menu1.add(menuItem1);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Affichage");

                //======== menu3 ========
                {
                    menu3.setText("Entreprise");

                    //---- menuItem4 ----
                    menuItem4.setText("Voir salari\u00e9s");
                    menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
                    menu3.add(menuItem4);

                    //---- menuItem5 ----
                    menuItem5.setText("Voir Garage");
                    menuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
                    menu3.add(menuItem5);

                    //---- menuItem6 ----
                    menuItem6.setText("Lancer une course");
                    menuItem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK));
                    menu3.add(menuItem6);
                }
                menu2.add(menu3);
                menu2.addSeparator();

                //---- menuItem2 ----
                menuItem2.setText("Liste des th\u00e8mes");
                menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK));
                menu2.add(menuItem2);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== tabbedPane1 ========
        {

            //======== panel3 ========
            {
                panel3.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
                javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax
                .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
                .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
                .Color.red),panel3. getBorder()));panel3. addPropertyChangeListener(new java.beans.
                PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".
                equals(e.getPropertyName()))throw new RuntimeException();}});
                panel3.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]"));
            }
            tabbedPane1.addTab("Course", panel3);

            //======== panel2 ========
            {
                panel2.setLayout(new BorderLayout());
                panel2.add(vSpacer1, BorderLayout.CENTER);

                //======== scrollPane1 ========
                {
                    scrollPane1.setPreferredSize(new Dimension(350, 200));
                    scrollPane1.setMaximumSize(new Dimension(500, 500));

                    //---- table1 ----
                    table1.setPreferredSize(new Dimension(525, 200));
                    table1.setPreferredScrollableViewportSize(new Dimension(500, 300));
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "Marque", "Prix (\u20ac)", "Cout d'utilisation"
                        }
                    ));
                    {
                        TableColumnModel cm = table1.getColumnModel();
                        cm.getColumn(0).setMinWidth(100);
                        cm.getColumn(1).setMinWidth(50);
                        cm.getColumn(2).setMinWidth(100);
                    }
                    table1.setMaximumSize(new Dimension(550, 200));
                    table1.setMinimumSize(new Dimension(450, 200));
                    scrollPane1.setViewportView(table1);
                }
                panel2.add(scrollPane1, BorderLayout.WEST);

                //======== scrollPane2 ========
                {
                    scrollPane2.setPreferredSize(new Dimension(500, 100));
                    scrollPane2.setMaximumSize(new Dimension(500, 100));

                    //---- table2 ----
                    table2.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "Marque", "Prix (\u20ac)", "Cylindr\u00e9e", "Masse", "Consommation", "Cout d'utilisation"
                        }
                    ));
                    {
                        TableColumnModel cm = table2.getColumnModel();
                        cm.getColumn(0).setMinWidth(100);
                        cm.getColumn(1).setMinWidth(50);
                        cm.getColumn(2).setMinWidth(50);
                        cm.getColumn(3).setMinWidth(50);
                        cm.getColumn(4).setMinWidth(100);
                        cm.getColumn(5).setMinWidth(100);
                    }
                    table2.setPreferredScrollableViewportSize(new Dimension(500, 300));
                    table2.setMaximumSize(new Dimension(525, 40));
                    scrollPane2.setViewportView(table2);
                }
                panel2.add(scrollPane2, BorderLayout.EAST);

                //======== panel4 ========
                {
                    panel4.setLayout(new MigLayout(
                        "hidemode 3,align center center",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]"));

                    //---- button1 ----
                    button1.setText("Ajouter V\u00e9lo");
                    panel4.add(button1, "cell 2 0");

                    //---- button2 ----
                    button2.setText("Supprimer V\u00e9lo");
                    panel4.add(button2, "cell 5 0");

                    //---- button3 ----
                    button3.setText("Ajouter Scooter");
                    panel4.add(button3, "cell 12 0");

                    //---- button4 ----
                    button4.setText("Supprimer Scooter");
                    panel4.add(button4, "cell 17 0");

                    //---- label5 ----
                    label5.setText("Marque");
                    panel4.add(label5, "cell 1 2");
                    panel4.add(textField1, "cell 2 2");

                    //---- label8 ----
                    label8.setText("Marque");
                    panel4.add(label8, "cell 11 2");
                    panel4.add(textField10, "cell 12 2");

                    //---- label11 ----
                    label11.setText("Masse");
                    panel4.add(label11, "cell 16 2");
                    panel4.add(textField12, "cell 17 2");

                    //---- label6 ----
                    label6.setText("Prix");
                    panel4.add(label6, "cell 1 3");
                    panel4.add(textField2, "cell 2 3");

                    //---- label9 ----
                    label9.setText("Prix");
                    panel4.add(label9, "cell 11 3");
                    panel4.add(textField9, "cell 12 3");

                    //---- label12 ----
                    label12.setText("Consomamtion");
                    panel4.add(label12, "cell 16 3");
                    panel4.add(textField11, "cell 17 3");

                    //---- label10 ----
                    label10.setText("Cylindr\u00e9e");
                    panel4.add(label10, "cell 11 4");
                    panel4.add(textField8, "cell 12 4");
                }
                panel2.add(panel4, BorderLayout.SOUTH);
            }
            tabbedPane1.addTab("Garage", panel2);

            //======== panel1 ========
            {
                panel1.setLayout(new MigLayout(
                    "hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
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
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //======== scrollPane4 ========
                {
                    scrollPane4.setPreferredSize(new Dimension(250, 200));

                    //---- list1 ----
                    list1.setPreferredSize(new Dimension(200, 400));
                    list1.setMaximumSize(new Dimension(200, 400));
                    scrollPane4.setViewportView(list1);
                }
                panel1.add(scrollPane4, "cell 0 0 1 10,align center center,grow 0 0");

                //---- button6 ----
                button6.setText("Ajouter Salari\u00e9");
                panel1.add(button6, "cell 17 0");

                //---- label1 ----
                label1.setText("Nom");
                panel1.add(label1, "cell 6 1");

                //---- textField5 ----
                textField5.setPreferredSize(new Dimension(150, 25));
                panel1.add(textField5, "cell 6 2");

                //---- label2 ----
                label2.setText("Masse");
                panel1.add(label2, "cell 6 4");

                //---- textField6 ----
                textField6.setPreferredSize(new Dimension(150, 20));
                panel1.add(textField6, "cell 6 5");

                //---- label3 ----
                label3.setText("Salaire (\u20ac/h)");
                panel1.add(label3, "cell 6 7");

                //---- textField3 ----
                textField3.setPreferredSize(new Dimension(150, 25));
                panel1.add(textField3, "cell 6 8");

                //---- label4 ----
                label4.setText("Type de Cycliste");
                panel1.add(label4, "cell 6 10");

                //---- textField4 ----
                textField4.setPreferredSize(new Dimension(150, 25));
                panel1.add(textField4, "cell 6 11");

                //---- button5 ----
                button5.setText("Sauvegarder");
                panel1.add(button5, "cell 17 13");
            }
            tabbedPane1.addTab("Salari\u00e9s", panel1);
        }
        contentPane.add(tabbedPane1, BorderLayout.NORTH);
        setSize(870, 590);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents




        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();

                model.insertRow(0,new Object[]{ textField1.getText(), textField2.getText(), Double.valueOf(textField2.getText())/30000});
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel modelle = (DefaultTableModel) table2.getModel();
                modelle.insertRow(0,new Object[]{ textField10.getText(), textField9.getText(), textField8.getText(),textField12.getText(),textField11.getText(),
                        (Double.valueOf(textField9.getText())/20000) + (Vehicule.getSp98price()*Double.valueOf(textField11.getText())/100)});
            }
        });
        table1.setAutoCreateRowSorter(true);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        table2.setAutoCreateRowSorter(true);
        DefaultTableModel modelle = (DefaultTableModel) table2.getModel();

        for(Vehicule vehicule : entreprise.getGa().getGarage().keySet() ) {
            if(vehicule.getClass() == Velo.class) {
                model.insertRow(0,new Object[]{ vehicule.getName(), vehicule.price, vehicule.getUsingPrice()});
            }
            else {
                modelle.insertRow(0,new Object[]{vehicule.getName(),vehicule.getPrice(),vehicule.getZylindre(),vehicule.getWeight(),vehicule.getConso(),vehicule.getUsingPrice()});
            }

        }

        DefaultListModel listModel = new DefaultListModel();
        for(Salaree salaree : entreprise.getEmploye()) {
            listModel.addElement(salaree.getName());
        }



        list1.setModel(listModel);



    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mateo Esteves
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem2;
    private JTabbedPane tabbedPane1;
    private JPanel panel3;
    private JPanel panel2;
    private JPanel vSpacer1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label5;
    private JTextField textField1;
    private JLabel label8;
    private JTextField textField10;
    private JLabel label11;
    private JTextField textField12;
    private JLabel label6;
    private JTextField textField2;
    private JLabel label9;
    private JTextField textField9;
    private JLabel label12;
    private JTextField textField11;
    private JLabel label10;
    private JTextField textField8;
    private JPanel panel1;
    private JScrollPane scrollPane4;
    private JList list1;
    private JButton button6;
    private JLabel label1;
    private JTextField textField5;
    private JLabel label2;
    private JTextField textField6;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
