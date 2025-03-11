import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input date
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter number of the month: ");
        int month = scanner.nextInt();
        
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        
        // Get day of the week
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // Print result
        System.out.println("The day of the week is: " + dayOfWeek);
        
        scanner.close();
    }
}
