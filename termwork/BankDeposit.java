import java.util.Scanner;
public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Deposit type:");
        System.out.println("1. Term Deposit (FD)");
        System.out.println("2. Recurring Deposit (RD)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter Principal amount (P): ");
                double p = sc.nextDouble();
                System.out.print("Enter Rate of Interest per annum (R): ");
                double r = sc.nextDouble();
                System.out.print("Enter Time period in years (N): ");
                int n = sc.nextInt();
                double a = p * Math.pow((1 + r / 100), n);
                System.out.println("Maturity Amount (A) for Term Deposit: " + a);
                break;
            case 2:
                System.out.print("Enter Monthly Installment (P): ");
                double p_rd = sc.nextDouble();
                System.out.print("Enter Rate of Interest per annum (R): ");
                double r_rd = sc.nextDouble();
                System.out.print("Enter Time period in months (N): ");
                int n_rd = sc.nextInt();
                double a_rd = (p_rd * n_rd) + (p_rd * n_rd * (n_rd + 1) / 2.0 * r_rd / 100 * 1/12.0);
                System.out.println("Maturity Amount (A) for Recurring Deposit: " + a_rd);
                break; 
            default:
                System.out.println("Invalid option. Please enter 1 for Term Deposit or 2 for Recurring Deposit.");  }
        sc.close();  }  }

