import java.awt.*;
import java.awt.event.*;

class second extends Frame {
    CardLayout cardLayout;
    Panel cardPanel;

    second() {
        super("AWT CardLayout Example");

        // Create CardLayout and set to the panel
        cardLayout = new CardLayout();
        cardPanel = new Panel();
        cardPanel.setLayout(cardLayout);

        // Create two cards (panels with buttons or any component)
        Panel card1 = new Panel();
        Button b1 = new Button("Go to Card 2");
        card1.add(b1);

        Panel card2 = new Panel();
        Button b2 = new Button("Go to Card 1");
        card2.add(b2);

        // Add cards to the card panel
        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");

        // Add card panel to the frame
        add(cardPanel);

        // Button actions to switch cards
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card2");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card1");
            }
        });

        setSize(400, 300);
        setVisible(true);

        // Add window close listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new second();
    }
}
