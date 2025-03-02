import java.util.*;

public class school {

    public static void main(String[] args) {
        int i, choice, flag = 0, index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students you want to enter:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        students[] accounts = new students[numStudents];

        
        for (i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String nameGet = scanner.nextLine();
            accounts[i] = new students(nameGet); 
        }

        do {
            System.out.println("Enter the name of the student to input marks (or type 'exit' to quit):");
            String nameGet = scanner.nextLine();

            if (nameGet.equalsIgnoreCase("exit")) {
                break; 
            }

            flag = 0;
            for (i = 0; i < numStudents; i++) {
                if (accounts[i].getName().equalsIgnoreCase(nameGet)) {
                    flag = 1;
                    index = i;
                    break;
                }
            }

            if (flag == 1) {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Input the " + j + " marks:");
                    int marks = scanner.nextInt();
                    accounts[i].addmarks(marks);
                    scanner.nextLine();
                }
                
                accounts[i].totalmarks();
                accounts[i].grade();
            } else {
                System.out.println("Student not found.");
            }
        } while (true);

        
    }
}

class students {
    private int marks = 0;
    private String name;

    students(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addmarks(int amount) {
        this.marks += amount;
    }

    void totalmarks() {
        System.out.println("Total marks for " + name + " is: " + marks);
    }
    void grade() {
        if (marks >= 300) {
            System.out.println("Grade is: A");
        } else if (marks >= 200) {
            System.out.println("Grade is: B");
        } else if (marks >= 100) {
            System.out.println("Grade is: C");
        } else {
            System.out.println("Grade is: F");
        }
    }
}
