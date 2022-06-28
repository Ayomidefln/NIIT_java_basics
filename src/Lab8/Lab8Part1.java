package Lab8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//Creating the Lab8Part1 class while extending JFrame and implementing ActionListeners
public class Lab8Part1 extends JFrame implements ActionListener{
    JFrame frame;
    JLabel showFileName;
    JButton button;


    public Lab8Part1(){
        frame = new JFrame();
        //Creating the showFileName label
        showFileName = new JLabel("The name of the file is: .........");

        //Adding the showFileName label to the JFrame
        frame.add(showFileName);

        //Creating the button
        button = new JButton("Show File Name in Label");

        //Adding the button to the ActionListener
        button.addActionListener(this);

        //Organizing the components of the JFrame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setLocationRelativeTo(null);
        frame.setSize(250,100);
        frame.setVisible(true);
        frame.setTitle("JFileChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding the button to the JFrame
        frame.add(button);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            //Launching the JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            //Selecting file to open
            fileChooser.showOpenDialog(null);

            //Creating a variable for selecting file to open
            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION) {
                //Retrieving the file information(name of the file) from the JFileChooser
                File file = new File(fileChooser.getSelectedFile().getName());
                //Updating the label to show the file name selected
                showFileName.setText("The name of the file is: " + file);
            }

        }

    }

    //Calling the main method
    public static void main(String[] args) {
        Lab8Part1 run = new Lab8Part1();
    }

}
