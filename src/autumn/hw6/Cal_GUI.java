package autumn.hw6;

import javax.swing.*;
import java.awt.*;

public class Cal_GUI extends JFrame {
    final int txtWidth = 70, lblWidth = 20, height = 20;
    final int btnWidth = 60, btnExtWidth = 90;

    JTextField txtNum1, txtNum2, txtResult;
    JLabel lblOp, lblEqual;
    JButton btnAdd, btnSub, btnMul, btnDiv, btnComp, btnReset;

    Container c;

    public Cal_GUI() {
        GUI_Setup();
    }

    public static void main(String[] args) {
        new Cal_GUI();
    }

    private void txt_lbl_Layout() {
        txtNum1 = new JTextField("", 15);
        txtNum1.setLocation(10, 10);
        txtNum1.setSize(txtWidth, height);
        txtNum1.setHorizontalAlignment(JTextField.RIGHT);

        lblOp = new JLabel("?");
        lblOp.setLocation(85, 10);
        lblOp.setSize(lblWidth, height);

        txtNum2 = new JTextField("", 15);
        txtNum2.setLocation(100, 10);
        txtNum2.setSize(txtWidth, height);
        txtNum2.setHorizontalAlignment(JTextField.RIGHT);

        lblEqual = new JLabel("=");
        lblEqual.setLocation(180, 10);
        lblEqual.setSize(lblWidth, height);

        txtResult = new JTextField("0", 10);
        txtResult.setLocation(200, 10);
        txtResult.setSize(txtWidth, height);
        txtResult.setHorizontalAlignment(JTextField.RIGHT);
    }

    private void btn_Layout() {
        btnAdd = new JButton("+");
        btnAdd.setLocation(10, 40);
        btnAdd.setSize(btnWidth, height);
        btnAdd.addActionListener((e) -> lblOp.setText("+"));

        btnSub = new JButton("-");
        btnSub.setLocation(80, 40);
        btnSub.setSize(btnWidth, height);
        btnSub.addActionListener((e) -> lblOp.setText("-"));

        btnMul = new JButton("*");
        btnMul.setLocation(150, 40);
        btnMul.setSize(btnWidth, height);
        btnMul.addActionListener((e) -> lblOp.setText("*"));

        btnDiv = new JButton("/");
        btnDiv.setLocation(220, 40);
        btnDiv.setSize(btnWidth, height);
        btnDiv.addActionListener((e) -> lblOp.setText("/"));

        btnReset = new JButton("Reset");
        btnReset.setLocation(50, 70);
        btnReset.setSize(btnExtWidth, height);
        btnReset.addActionListener((e) -> {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("0");
            lblOp.setText("?");
            txtNum1.requestFocus();
        });

        btnComp = new JButton("Compute");
        btnComp.setLocation(150, 70);
        btnComp.setSize(btnExtWidth, height);
        btnComp.addActionListener(((e) -> {
            float op1 = Float.parseFloat(txtNum1.getText());
            float op2 = Float.parseFloat(txtNum2.getText());
            float result = switch (lblOp.getText()) {
                case "+" -> op1 + op2;
                case "-" -> op1 - op2;
                case "*" -> op1 * op2;
                case "/" -> op1 == 0 ? 0 : op1 / op2;
                default -> throw new IllegalStateException("Unexpected value: " + lblOp.getText());
            };
            txtResult.setText(Float.toString(result));
        }));
    }

    private void GUI_Setup() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt_lbl_Layout();
        btn_Layout();

        c = getContentPane();
        c.setLayout(null);

        c.add(txtNum1);
        c.add(lblOp);
        c.add(txtNum2);
        c.add(lblEqual);
        c.add(txtResult);

        c.add(btnAdd);
        c.add(btnSub);
        c.add(btnMul);
        c.add(btnDiv);

        c.add(btnReset);
        c.add(btnComp);

        setSize(300, 150);
        setVisible(true);
    }
}
