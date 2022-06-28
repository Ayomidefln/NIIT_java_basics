package GUI.Basics;

import javax.swing.*;

public class JFrameExample extends JFrame {
    public JFrameExample(){
        setVisible(true);
        setTitle("Demo");
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        JFrameExample run = new JFrameExample();
    }
}
