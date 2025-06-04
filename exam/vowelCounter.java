import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class vowelCounter extends JFrame implements ActionListener {
    JTextField input, result;
    JButton count, reset, exit;

    public vowelCounter() {
        setTitle("Vowel Counter");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input row
        add(new JLabel("Enter a string:"));
        input = new JTextField();
        add(input);

        // Result row
        add(new JLabel("Vowel Count:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        // Count button
        count = new JButton("Count Vowels");
        count.addActionListener(this);
        add(count);

        // Reset button
        reset = new JButton("Reset");
        reset.addActionListener(this);
        add(reset);

        // Exit button
        exit = new JButton("Exit");
        exit.addActionListener(this);
        add(exit);

        // Filler label to align grid properly
        add(new JLabel(""));

        // Footer label
        add(new JLabel("Vowel Counter Application", JLabel.CENTER));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == count) {
            String text = input.getText().toLowerCase();
            int vowelCount = 0;
            for (char c : text.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                }
            }
            result.setText(String.valueOf(vowelCount));
        } else if (e.getSource() == reset) {
            input.setText("");
            result.setText("");
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new vowelCounter();
    }
}
