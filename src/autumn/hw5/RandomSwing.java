package autumn.hw5;

import javax.swing.*;
import java.awt.*;

public class RandomSwing extends JFrame {
    public RandomSwing() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i < 20; i++) {
            JLabel label = new JLabel("");
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            label.setBackground(Color.BLUE);
            label.setLocation(x, y);
            label.setSize(10, 10);
            label.setOpaque(true);
            c.add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomSwing();
    }
}
