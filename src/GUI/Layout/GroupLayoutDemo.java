package GUI.Layout;

import javax.swing.*;

public class GroupLayoutDemo extends JFrame {
    JPanel panel;
    JButton add, reset, delete, submit;

    public GroupLayoutDemo(){

        panel = new JPanel();

        add = new JButton("Add");
        reset = new JButton("Reset");
        delete = new JButton("Delete");
        submit = new JButton("Submit");

        GroupLayout layout = new GroupLayout(panel);
        setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(add)
                        .addComponent(reset)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(delete)
                                .addComponent(submit))
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(add)
                                .addComponent(reset)
                                .addComponent(delete))
                        .addComponent(submit)
        );

//        panel.add(add);
//        panel.add(reset);
//        panel.add(delete);
//        panel.add(submit);

        setVisible(true);
        setSize(300,300);
        setTitle("Group Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panel);

    }

    public static void main(String[] args) {
        GroupLayoutDemo run = new GroupLayoutDemo();
    }

}
