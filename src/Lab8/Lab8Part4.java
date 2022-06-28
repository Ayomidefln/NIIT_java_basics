package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Lab8Part4 extends JFrame implements ActionListener, MouseMotionListener, MouseListener{
    JLabel imgLabel = new JLabel();

    JPanel First = new JPanel();
    JPanel Second = new JPanel();
    JPanel Third = new JPanel();
    JPanel Fourth = new JPanel();

    JButton firstButton = new JButton();

    JLabel Panel3Label1 = new JLabel();
    JLabel Panel3Label2 = new JLabel();

    JLabel Panel4Label1 = new JLabel();

    public Lab8Part4() {


        //FIRST JPANEL STARTS
        JLabel firstLabel = new JLabel();
        firstLabel.setText("imageLabel");


        firstButton.addActionListener(this);
        firstButton.setText("Select Image");

        First.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        First.setBounds(0,0,250,500);

        First.add(firstLabel);
        First.add(firstButton);
        First.add(imgLabel);
        //FIRST JPANEL STARTS


        //SECOND JPANEL STARTS
        Second.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Second.setBounds(250,0,250,500);

        Second.addMouseListener(this);
        //SECOND JPANEL STARTS


        //THIRD JPANEL STARTS
        Third.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Third.setBounds(500,0,250,500);

        Panel3Label1.setText("locationLabel: "); //SETTING TEXT TO JLABEL

        Third.add(Panel3Label1);    //ADDING JLABEL TO THE PANEL
        Third.add(Panel3Label2);    //ADDING JLABEL TO THE PANEL

        Third.addMouseMotionListener(this); //ADDING MOUSE MOTION LISTENER
        //THIRD JPANEL ENDS


        //FOURTH JPANEL STARTS
        Fourth.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Fourth.setBounds(750,0,250,500);

        Panel4Label1.setText("infoLabel");  //SETTING TEXT TO JLABEL

        Fourth.add(Panel4Label1);   //ADDING JLABEL TO THE PANEL

        Panel4Label1.addMouseListener(this);    //ADDING MOUSE MOTION LISTENER
        //FOURTH JPANEL ENDS


        setSize(1000, 500);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Part 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        add(First);
        add(Second);
        add(Third);
        add(Fourth);

    }

    public static void main(String[] args) {
        Lab8Part4 run = new Lab8Part4();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        String x = "X location is : " + me.getX();
        String y = "Y location is : " + me.getY();
        Panel3Label2.setText(x + " and " + y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Panel4Label1.setText("Slán Abhaile!, luch!!!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == Second) {
            Color initialColor = Color.RED;
            Color color = JColorChooser.showDialog(this, "Choose a color", initialColor);
            Second.setBackground(color);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==firstButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION) {
                File fileSelected = fileChooser.getSelectedFile();
                imgLabel.setIcon(new ImageIcon(String.valueOf(fileSelected)));
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
