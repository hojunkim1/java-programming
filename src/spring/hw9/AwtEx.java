package spring.hw9;

import java.awt.*;

public class AwtEx {
    public AwtEx() {
        Frame f = new Frame();

        f.setSize(400, 300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);

        Label l = new Label("Employee id:");
        l.setBounds(20, 80, 80, 30);
        f.add(l);

        Button b = new Button("Submit");
        b.setBounds(100, 100, 80, 30);
        f.add(b);

        TextField t = new TextField();
        t.setBounds(20, 100, 80, 30);
        f.add(t);
    }

    public static void main(String[] args) {
        AwtEx awt = new AwtEx();
    }
}
