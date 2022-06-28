package GUI.Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    //declare the
    JButton reset, add, update,submit, delete;

    public BorderLayoutDemo(){
        //created object of each button component
        reset = new JButton("Reset");
        add = new JButton("Add");
        update = new JButton("Update");
        submit = new JButton("Submit");
        delete = new JButton("Delete");


        //calling the JFrame properties
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setTitle("BorderLayout");
        setDefaultCloseOperation(3);

        //set layout
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        //set each component to the frame
        add(add, BorderLayout.NORTH);
        add(reset,BorderLayout.EAST);
        add(submit,BorderLayout.CENTER);
        add(update,BorderLayout.WEST);
        add(delete,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        BorderLayoutDemo rn = new BorderLayoutDemo();
    }

}
