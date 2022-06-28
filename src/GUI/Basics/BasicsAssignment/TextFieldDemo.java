package GUI.Basics.BasicsAssignment;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {

    JTextField jtextField;

    public TextFieldDemo(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label =  new JLabel("Enter Your Full Name: ");
        panel.add(label);
        jtextField = new JTextField("",15);
        panel.add(jtextField);

        add(panel);

        setTitle("TextField Demo");
        setSize(700,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }

    public static void main(String[] args) {
        TextFieldDemo run = new TextFieldDemo();
    }
}
