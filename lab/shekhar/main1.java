

import numberutils.*; 
import java.util.Scanner; // Import the Scanner class

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        prime primeChecker = new prime(); // Create an instance of PrimeChecker
        boolean isPrime = primeChecker.isPrime(number); // Check if the number is prime

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close(); // Close the scanner
    }
}
