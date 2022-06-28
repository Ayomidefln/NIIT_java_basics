package GUI.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends JFrame implements ActionListener {
    Button btn;
    TextField text;

    public ActionListenerDemo(){
        setTitle("Action Listener");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        btn = new Button("Click");
        text = new TextField(30);

        btn.addActionListener(this);

        add(btn);
        add(text);

    }

    public static void main(String[] args) {
        ActionListenerDemo run = new ActionListenerDemo();
    }

    int count = 1;

    @Override
    public void actionPerformed(ActionEvent e){
//        System.out.println("Clicked");
        text.setText("Clicked: " + count + " time(s)");
        ++count;
    }
}