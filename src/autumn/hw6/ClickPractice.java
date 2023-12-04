package autumn.hw6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickPractice extends JFrame {

    Container c;
    JLabel la;

    public ClickPractice() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContainer();
        setLabel();
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickPractice();
    }

    private void setContainer() {
        c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MouseListener());
        c.setFocusable(true);
        c.requestFocus();
    }

    private void setLabel() {
        la = new JLabel("c");
        la.setFont(new Font("Arial", Font.PLAIN, 16));
        la.setSize(20, 20);
        la.setLocation(100, 100);
        c.add(la);
    }

    class MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
        }
    }
}
