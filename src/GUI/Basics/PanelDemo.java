package GUI.Basics;

import javax.swing.*;
import java.awt.*;

public class PanelDemo  extends JFrame {
    JPanel panel;

    public PanelDemo(){
        panel = new JPanel();
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("The Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        panel.setBackground(Color.red); //add color to panel
    }

    public static void main(String[] args) {
        PanelDemo run = new PanelDemo();
    }
}
