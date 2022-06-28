package GUI.Basics.BasicsAssignment;

import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame {
    JRadioButton radioButton;

    public RadioButtonDemo() {
        JFrame frame = new JFrame();
        JRadioButton jRadioButton1 = new JRadioButton();
        JRadioButton jRadioButton2 = new JRadioButton();
        JLabel label1 = new JLabel("");
        ButtonGroup group = new ButtonGroup();
        JButton jButton = new JButton("CLick");
        jRadioButton1.setText("Single");
        jRadioButton2.setText("Married");
        jRadioButton1.setBounds(120, 30, 120, 50);
        jRadioButton2.setBounds(250, 30, 80, 50);
        jButton.setBounds(125, 90, 80, 30);
        frame.add(jRadioButton1);
        frame.add(jRadioButton2);
        frame.add(jButton);
        frame.add(label1);
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component)null);
        frame.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
