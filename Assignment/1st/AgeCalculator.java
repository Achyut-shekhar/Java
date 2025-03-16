import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input birthdate
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        
        System.out.print("Enter birth month: ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("Enter birth day: ");
        int birthDay = scanner.nextInt();
        
        // Get current date
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        
        // Calculate age
        Period age = Period.between(birthDate, currentDate);
        
        // Print result
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
        
        scanner.close();
    }
}
