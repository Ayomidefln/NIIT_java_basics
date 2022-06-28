package LabWork1;

import javax.swing.*;

public class Work2 extends JFrame {

    JTextArea textArea;
    JPanel panel;
    JButton button;
    JMenuBar menuBar;
    JMenu schoolmenu, coursemenu;
    JMenuItem NIIT, HIIT, Andela, MMS, MIS, Networking;


    public Work2(){
        panel = new JPanel();

        menuBar = new JMenuBar();

        schoolmenu = new JMenu("School");
        coursemenu = new JMenu("Course");


        NIIT = new JMenuItem("NIIT");
        HIIT = new JMenuItem("HIIT");
        Andela = new JMenuItem("Andela");
        MMS = new JMenuItem("MMS");
        MIS = new JMenuItem("MIS");
        Networking = new JMenuItem("Networking");

        schoolmenu.add(NIIT);
        schoolmenu.add(HIIT);
        schoolmenu.add(Andela);

        coursemenu.add(MMS);
        coursemenu.add(MIS);
        coursemenu.add(Networking);

        menuBar.add(schoolmenu);
        menuBar.add(coursemenu);

        textArea = new JTextArea(20,40);

        button = new JButton("Click Me!");

        panel = new JPanel();
        panel.add(textArea);
        panel.add(button);
        add(panel);

        setJMenuBar(menuBar);
        setTitle("MenuItem Demo");
        setSize(500,500);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        Work2 run = new Work2();
    }

}
