package autumn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        setTitle("practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        JButton button = new JButton("click");
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked!");
                button.setBackground(Color.YELLOW);
                button.setText("YEAH!");
            }
        });

        c.add(button);

        setSize(500, 500);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MyFrame();
    }
}
