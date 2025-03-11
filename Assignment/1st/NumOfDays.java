import java.util.Scanner;
import java.time.YearMonth;

public class NumOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input month and year
        System.out.print("Input a month number: ");
        int month = scanner.nextInt();
        
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        
        // Get number of days in the given month of the given year
        YearMonth yearMonth = YearMonth.of(year, month);
        int days = yearMonth.lengthOfMonth();
        
        // Get month name
        String monthName = yearMonth.getMonth().toString();
        
        // Print result
        System.out.println(monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase() + " " + year + " has " + days + " days.");
        
        scanner.close();
    }
}
