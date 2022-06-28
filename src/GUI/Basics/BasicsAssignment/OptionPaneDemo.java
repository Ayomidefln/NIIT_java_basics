package GUI.Basics.BasicsAssignment;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OptionPaneDemo extends JFrame {
    JOptionPane optionPane;

    OptionPaneDemo() {
        new JOptionPane();
        JOptionPane.showInputDialog("Confirm payment?");
        JOptionPane.showConfirmDialog((Component)null, "Confirm");
        JOptionPane.showMessageDialog((Component)null, "Payment confirmed");
        JOptionPane.showOptionDialog((Component)null, "This is the Option dialogue", "Option code", 1, 2, (Icon)null, new String[]{"proceed", "Return"}, "B");
        JFrame frame = new JFrame();
        new JPanel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo((Component)null);
    }

    public static void main(String[] args) {
        new OptionPaneDemo();
    }
}
