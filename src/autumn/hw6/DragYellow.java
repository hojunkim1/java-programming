package autumn.hw6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragYellow extends JFrame {
    public DragYellow() {
        setTitle("드래깅 동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                c.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                c.setBackground(Color.GREEN);
            }
        });

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DragYellow();
    }
}
