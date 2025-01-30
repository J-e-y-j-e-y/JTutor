package lessons.oop.nested_classes_examples.anonymous_classes_ex.ex2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class AnonymousClassExample extends JFrame {
    public AnonymousClassExample() {
        setTitle("Анонимный класс в Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton button = new JButton("Нажми меня!");
        add(button);

        // Анонимный класс, реализующий ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AnonymousClassExample.this, "Кнопка нажата!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnonymousClassExample frame = new AnonymousClassExample();
            frame.setVisible(true);
        });
    }
}
