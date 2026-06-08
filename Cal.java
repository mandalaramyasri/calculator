import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Cal {
    static double num1, num2, result;
    static String op;

    public static void main(String args[]) {

        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();

        tf.setBounds(20,20,240,40);
        f.add(tf);

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton equal = new JButton("=");
        JButton ac = new JButton("AC");

        b7.setBounds(20,80,50,50);
        b8.setBounds(80,80,50,50);
        b9.setBounds(140,80,50,50);
        div.setBounds(200,80,50,50);

        b4.setBounds(20,140,50,50);
        b5.setBounds(80,140,50,50);
        b6.setBounds(140,140,50,50);
        mul.setBounds(200,140,50,50);

        b1.setBounds(20,200,50,50);
        b2.setBounds(80,200,50,50);
        b3.setBounds(140,200,50,50);
        minus.setBounds(200,200,50,50);

        b0.setBounds(20,260,50,50);
        ac.setBounds(80,260,50,50);
        equal.setBounds(140,260,50,50);
        plus.setBounds(200,260,50,50);

        JButton nums[] = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9};

        for(JButton b : nums)
        {
            b.addActionListener(e ->
                tf.setText(tf.getText()+b.getText()));
        }

        plus.addActionListener(e -> {
            num1 = Double.parseDouble(tf.getText());
            op = "+";
            tf.setText("");
        });

        minus.addActionListener(e -> {
            num1 = Double.parseDouble(tf.getText());
            op = "-";
            tf.setText("");
        });

        mul.addActionListener(e -> {
            num1 = Double.parseDouble(tf.getText());
            op = "*";
            tf.setText("");
        });

        div.addActionListener(e -> {
            num1 = Double.parseDouble(tf.getText());
            op = "/";
            tf.setText("");
        });

        equal.addActionListener(e -> {
            num2 = Double.parseDouble(tf.getText());

            switch(op)
            {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            tf.setText(String.valueOf(result));
        });

        ac.addActionListener(e -> tf.setText(""));

        f.add(b0); f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5); f.add(b6); f.add(b7); f.add(b8); f.add(b9);
        f.add(plus); f.add(minus); f.add(mul); f.add(div);
        f.add(equal); f.add(ac);

        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}