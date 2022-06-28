package GUI.Basics.BasicsAssignment;

import javax.swing.*;

public class LabelDemo extends JFrame {
    JLabel jLabel;

    public LabelDemo() {
        JFrame frame = new JFrame("label");

        jLabel = new JLabel();
        jLabel.setText("New Label");

        JPanel panel = new JPanel();
        panel.add(jLabel);

        add(panel);

        setTitle("TextField Demo");
        setSize(700,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        LabelDemo run = new LabelDemo();
    }

}
