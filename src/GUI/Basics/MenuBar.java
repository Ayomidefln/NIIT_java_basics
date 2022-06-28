package GUI.Basics;

import javax.swing.*;

public class MenuBar extends JFrame {
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;

    public MenuBar(){
        menuBar = new JMenuBar();  // object of JMenuBar

        //creating objects of Jmenu and assigning title
        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        exitmenu = new JMenu("Exit");

        //adding JMenu to JmenuBar
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);

        setJMenuBar(menuBar);

        setSize(300,300);
        setVisible(true);
        setTitle("MenuBar");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MenuBar run = new MenuBar();
    }
}
