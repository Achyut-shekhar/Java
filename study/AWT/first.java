import java.awt.*;

class first extends Frame {
    first() {
        // Create a frame
        Frame f = new Frame("AWT Example");
        
        // Create a button
        Button b = new Button("Click Me");
        
        // Add button to the frame
        f.add(b);
        
        // Set the size of the frame
        f.setSize(300, 300);
        
        // Set layout to null
        f.setLayout(null);
        
        // Set button position and size
        b.setBounds(100, 100, 80, 30);
        
        // Make the frame visible
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new first();
    }
}