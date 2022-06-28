package GUI.Basics.BasicsAssignment;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxDemo extends JFrame {
    JComboBox comboBox;

    public ComboBoxDemo() {
        JLabel label = new JLabel("Select state of origin");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        String[] ComboboxList = new String[]{"Lagos", "Ibadan", "Ekiti", "Ebonyi", "Abuja", "Kano"};
        JComboBox comboBox = new JComboBox(ComboboxList);
        panel.add(label);
        panel.add(comboBox);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo((Component)null);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
