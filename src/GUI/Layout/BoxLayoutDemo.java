package GUI.Layout;

import javax.swing.*;

public class BoxLayoutDemo extends JFrame {

    JButton add, reset, delete, submit;

    public BoxLayoutDemo(){

        add = new JButton("Add");
        reset = new JButton("Reset");
        delete = new JButton("Delete");
        submit = new JButton("Submit");

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);

        add(add);
        add(reset);
        add(delete);
        add(submit);

        setVisible(true);
        setSize(300,300);
        setTitle("Boxlayout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        BoxLayoutDemo run = new BoxLayoutDemo();
    }

}
