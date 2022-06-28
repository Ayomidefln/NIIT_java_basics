package GUI.Basics;

import javax.swing.*;

public class MenuBarDemo extends JFrame {
    JMenuBar MenuBar;

    public MenuBarDemo(){
        MenuBar = new JMenuBar();
        setJMenuBar(MenuBar);

        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("JMenuBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MenuBarDemo run = new MenuBarDemo();
    }
}
