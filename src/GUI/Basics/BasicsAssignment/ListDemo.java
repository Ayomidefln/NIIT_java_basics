package GUI.Basics.BasicsAssignment;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ListDemo extends JFrame {
    JList jList;

    public ListDemo() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select Your Country/Region :");

        String[] icecream = new String[]{
                "Liberia","Madagadscar",
                "Togo","Senegal",
                "Cameroon", "Ghana",
                "Nigeria"
        };
        JList list = new JList(icecream);
        panel.add(label);
        panel.add(list);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo((Component)null);
    }

    public static void main(String[] args) {
        new ListDemo();
    }
}
