package GUI.Basics;

import javax.swing.*;

public class JFrameDemo {
    JFrame frame;

    public JFrameDemo(){
        frame = new JFrame();

        //basic methods
        frame.setVisible(true);
        frame.setTitle("Demo");
        frame.setSize(500,250);

        //other methods
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public static void main(String[] args) {
        JFrameDemo run = new JFrameDemo();
    }
}
