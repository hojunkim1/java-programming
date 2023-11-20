package autumn.hw5;

import javax.swing.*;
import java.awt.*;

public class Rainbow extends JFrame {
    public Rainbow() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setSize(10, 20);
            c.add(button);
        }

        setSize(700, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rainbow();
    }
}
