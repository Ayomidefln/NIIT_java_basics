package GUI.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo implements MouseMotionListener {

    Label label1, label2;
    JFrame frame;

    MouseMotionListenerDemo(){
        frame = new JFrame("Mouse Motion Listener");

        label1 = new Label("Tracking mouse cursor", Label.CENTER);
        label2 = new Label();

        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(label2);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseMotionListener(this);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void mouseDragged(MouseEvent me) {
        String s = me.getX() + "," + me.getY();
        label2.setText("Mouse dragged " + s);
        frame.setVisible(true);
    }
    public void mouseMoved(MouseEvent me) {
        String s = me.getX() + "," + me.getY();
        label2.setText("Mouse moved " + s);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MouseMotionListenerDemo run = new MouseMotionListenerDemo();
    }
}
