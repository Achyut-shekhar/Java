import java.util.Scanner;


class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}


public class password {


    public static void validatePassword(String password) throws WeakPasswordException {
       
        String strongPasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

        if (!password.matches(strongPasswordPattern)) {
            throw new WeakPasswordException("Password must be at least 8 characters long and include a digit, uppercase, lowercase, and a special character.");
        }

        System.out.println("Password is strong.");
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a password to validate: ");
        String password = scanner.nextLine();

        try {
 
            validatePassword(password);
        } catch (WeakPasswordException e) {

            System.out.println("Validation failed: " + e.getMessage());
        } finally {

            scanner.close();
        }
    }
}
