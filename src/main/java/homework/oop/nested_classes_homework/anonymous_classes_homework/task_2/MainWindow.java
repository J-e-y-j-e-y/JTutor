package homework.oop.nested_classes_homework.anonymous_classes_homework.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame {
    MainWindow() {
        super("Demo program for JButton");
        setLayout(new FlowLayout());

        // a default button
        JButton button1 = new JButton("Edit");
        add(button1);


        // a button with both text and icon
        JButton button2 = new JButton("Exit");
        add(button2);

        // add event listener - recommended way
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // delegate to event handler method
                buttonActionPerformed(evt);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // customize button's appearance
        button1.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        button1.setBackground(Color.YELLOW);
        button1.setForeground(Color.BLUE);

        button1.setText("<html><color=blue><b>Edit</b></font></html>");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void buttonActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(MainWindow.this, "Button #1 is clicked!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
