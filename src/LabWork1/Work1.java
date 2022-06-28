package LabWork1;

import GUI.Basics.BasicsAssignment.TextAreaDemo;

import javax.swing.*;

public class Work1 extends JFrame {
    JFrame frame;

    JTextField textField;
    JTextField textField1;

    JLabel label;
    JLabel label1;

    public Work1(){
        frame = new JFrame("Text field");

        label = new JLabel("Username");
        textField = new JTextField("",10);

        label1 = new JLabel("Password");
        textField1 = new JTextField("",10);

        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(textField);

        jPanel.add(label1);
        jPanel.add(textField1);

        add(jPanel);

        setTitle("TextField Demo");
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Work1 run = new Work1();
    }

}
