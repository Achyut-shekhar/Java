import java.util.Scanner;
class MyCalculator {
    public int power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}

public class Exceptionhandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        while (true) {
            System.out.print("Enter two integers (n and p) or enter -1 to exit: ");
            int n = sc.nextInt();
            if (n == -1) {
                break; 
            }
            int p = sc.nextInt();
            try {
                if (n == 0 && p == 0) {
                    throw new Exception("n and p should not be zero");
                }
                int result = myCalculator.power(n, p);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Program terminated.");
    }
}
