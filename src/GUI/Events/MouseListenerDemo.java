package GUI.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerDemo(){
        setTitle("Mouse Listener");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Initial Text");
        add(label);
        addMouseListener(this);

    }

    public static void main(String[] args) {
        MouseListenerDemo run = new MouseListenerDemo();
    }
    @Override
    public void mouseClicked(MouseEvent e){
//        System.out.println("Clicked");
        label.setText("Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e){
        label.setText("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }


}
