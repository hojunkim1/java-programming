package autumn.hw5;

import javax.swing.*;
import java.awt.*;

public class CalculatorSwing extends JFrame {
    public CalculatorSwing() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(inputPanel(), BorderLayout.NORTH);
        c.add(keypadPanel(), BorderLayout.CENTER);
        c.add(resultPanel(), BorderLayout.SOUTH);

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }

    private JPanel inputPanel() {
        JPanel f = new JPanel();
        f.setBackground(Color.LIGHT_GRAY);
        f.add(new JLabel("수식 입력"));
        f.add(new JTextField("", 30));
        return f;
    }

    private JPanel keypadPanel() {
        JPanel f = new JPanel();
        f.setLayout(new GridLayout(4, 4, 4, 4));
        for (int i = 0; i < 10; i++)
            f.add(keypadButton(Integer.toString(i), Color.WHITE));
        f.add(keypadButton("CE", Color.WHITE));
        f.add(keypadButton("계산", Color.WHITE));
        f.add(keypadButton("+", Color.CYAN));
        f.add(keypadButton("-", Color.CYAN));
        f.add(keypadButton("/", Color.CYAN));
        f.add(keypadButton("/", Color.CYAN));
        return f;
    }

    private JButton keypadButton(String value, Color color) {
        JButton button = new JButton(value);
        button.setBackground(color);
        button.setBorderPainted(false);
        button.setOpaque(true);
        return button;
    }

    private JPanel resultPanel() {
        JPanel f = new JPanel();
        f.setBackground(Color.YELLOW);
        f.add(new JLabel("계산 결과"));
        f.add(new JTextField("", 30));
        return f;
    }
}
