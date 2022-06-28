package GUI.Layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    JPanel panel;
    JButton add, delete, reset, submit, click;

    public GridLayoutDemo(){
        add = new JButton("Add");
        delete = new JButton("Delete");
        reset = new JButton("Reset");
        submit = new JButton("Submit");
        click = new JButton("Click");

        GridLayout layout = new GridLayout();
        setLayout(layout);

        panel = new JPanel();

        panel.add(add);
        panel.add(delete);
        panel.add(reset);
        panel.add(submit);
        panel.add(click);

        setTitle("Grid Layout");
        setSize(300,300);
        setVisible(true);

        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        add(panel);

    }

    public static void main(String[] args) {
        GridLayoutDemo run = new GridLayoutDemo();
    }

}
