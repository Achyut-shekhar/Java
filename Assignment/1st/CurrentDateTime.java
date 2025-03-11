import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Format date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Print current date and time
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}
