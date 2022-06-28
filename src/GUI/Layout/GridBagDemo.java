package GUI.Layout;

import javax.swing.*;
import java.awt.*;

public class GridBagDemo extends JFrame {

    JButton red, blue, green;

    public GridBagDemo(){
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");

        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(3);
        setTitle("GribBag Demo");
        setLocationRelativeTo(null);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 1;
        add(red, c);

        c.gridx = 1;
        c.gridy = 0;
        add(blue, c);

        c.gridx = 1;
        c.gridy = 2;
        add(green, c);

    }

    public static void main(String[] args) {
        GridBagDemo run = new GridBagDemo();
    }

}
