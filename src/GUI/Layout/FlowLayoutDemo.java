package GUI.Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    JButton add, update, delete;

    public FlowLayoutDemo(){

        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");

        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        add(add);
        add(update);
        add(delete);

        setVisible(true);
        setSize(200,200);
        setTitle("FlowLayout");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        FlowLayoutDemo run = new FlowLayoutDemo();
    }

}
