import java.util.Scanner;
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class Employee {
    int empId;
    String name;
    int deptId;
    void acceptDetails() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID (2001 - 5001): ");
        empId = sc.nextInt();
        if (empId < 2001 || empId > 5001)
            throw new MyException("Employee ID must be between 2001 and 5001.");
        System.out.print("Enter Employee Name (First letter capital): ");
        name = sc.next();
        if (!Character.isUpperCase(name.charAt(0)))
            throw new MyException("First letter of name must be capital.");

        System.out.print("Enter Department ID (1 - 5): ");
        deptId = sc.nextInt();
        if (deptId < 1 || deptId > 5)
            throw new MyException("Department ID must be between 1 and 5.");
    }

    void printDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department ID: " + deptId);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Employee e = new Employee();
        try {
            e.acceptDetails();
            e.printDetails();
        } catch (MyException ex) {
            System.out.println("Error: " + ex);
        }
    }
}


 
