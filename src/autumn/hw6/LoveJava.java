package autumn.hw6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoveJava extends JFrame {

    Container c;
    JLabel la;
    int fontsize;

    public LoveJava() {
        setTitle("+, - 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContainer();
        setLabel();
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoveJava();
    }

    private void setContainer() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new KeyListener());
        c.setFocusable(true);
        c.requestFocus();
    }

    private void setLabel() {
        la = new JLabel("Love Java");
        la.setFont(new Font("Arial", Font.PLAIN, fontsize = 10));
        c.add(la);
    }

    private class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            char keyChar = e.getKeyChar();
            if (keyChar == '+') {
                fontsize += 5;
                la.setFont(new Font("Arial", Font.PLAIN, fontsize));
            } else if (keyChar == '-') {
                fontsize -= 5;
                la.setFont(new Font("Arial", Font.PLAIN, fontsize));
            }
        }
    }
}
