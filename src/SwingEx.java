import javax.swing.*;

public class SwingEx {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        f.add(b);
    }
}
