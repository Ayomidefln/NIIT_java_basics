package GUI.Basics.BasicsAssignment;

import javax.swing.*;

public class TextAreaDemo extends JFrame {
    JTextArea textArea;

    public TextAreaDemo(){
        JFrame frame = new JFrame("Text field");

        JLabel label = new JLabel("Enter Your Full Name");

        JTextArea area = new JTextArea(1,10);

        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(area);
        add(jPanel);

        setTitle("TextField Demo");
        setSize(700,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        TextAreaDemo run = new TextAreaDemo();
    }

}
