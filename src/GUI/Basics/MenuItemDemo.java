package GUI.Basics;

import javax.swing.*;
import java.awt.*;

public class MenuItemDemo extends JFrame {
//    JPanel panel;
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;
    JMenuItem openitem, newitem,copyitem, pasteitem, closeitem;


    public MenuItemDemo(){
//        panel = new JPanel();

        menuBar = new JMenuBar();

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        exitmenu = new JMenu("Exit");


        newitem = new JMenuItem("New");
        openitem = new JMenuItem("Open");
        copyitem = new JMenuItem("Copy");
        pasteitem = new JMenuItem("Paste");
        closeitem = new JMenuItem("Close");

        filemenu.add(newitem);
        filemenu.add(openitem);

        editmenu.add(copyitem);
        editmenu.add(pasteitem);

        exitmenu.add(closeitem);


        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);

        setJMenuBar(menuBar);
        setTitle("MenuItem Demo");
        setSize(700,500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        add(panel);
//        panel.setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        MenuItemDemo run = new MenuItemDemo();
    }

}
