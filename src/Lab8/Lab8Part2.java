package Lab8;

import GUI.Layout.BorderLayoutDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab8Part2 extends JFrame implements ActionListener{
    JFrame frame;
    JPanel panel;
    JPanel panel1;
    JPanel panel2;
    JButton button1;
    JButton button2;
    BorderLayout borderLayout;


    public Lab8Part2(){
        frame = new JFrame();

        panel= new JPanel();
        panel1= new JPanel();
        panel2= new JPanel();
        panel1.setSize(200,200);
        panel2.setSize(200,200);
        panel1.setVisible(true);
        panel2.setVisible(true);
        panel.setSize(500,500);
        panel.setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.add(panel1, BorderLayout.WEST);
        panel.add(panel2,BorderLayout.EAST);

        button1 = new JButton();
        button2 = new JButton();
        button1.setText("Change Color of Left Panel");
        button2.setText("Change Color of Right Panel");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button1.setSize(100,100);
        button2.setSize(100,100);

//        frame.add(panel1, BorderLayout.CENTER);
//        frame.add(panel2, BorderLayout.CENTER);
        frame.add(button1, BorderLayout.WEST);
        frame.add(button2, BorderLayout.EAST);
        frame.setVisible(true);
        frame.setTitle("The Frame");
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BoxLayout.Y_AXIS);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            Color initialColor = Color.WHITE;
            Color color = JColorChooser.showDialog(this, "Choose a color", initialColor);
            panel1.setBackground(color);
        } else {
            Color initialColor2 = Color.BLACK;
            Color color2 = JColorChooser.showDialog(this, "Choose a color", initialColor2);
            panel2.setBackground(color2);

        }


    }

    public static void main(String[] args) {
        Lab8Part2 run = new Lab8Part2();
    }
}
