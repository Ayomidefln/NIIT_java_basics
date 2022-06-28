package GUI.Basics.BasicsAssignment;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame {
    JButton button;

    public ButtonDemo() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        new JLabel();
        JButton button = new JButton("Click Me!");
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo((Component)null);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}