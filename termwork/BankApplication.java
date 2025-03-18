import java.util.Scanner; 
class Bank {
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    private static int accountCounter = 1001;
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountCounter++;}
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);  }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");}     }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");}    }
    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully.");}
    public int getAccountNumber() {
        return accountNumber;}      }
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Bank[] accounts = new Bank[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); 
            accounts[i] = new Bank(name, address, balance);} 
        int choice;
        do {
            System.out.println("\n** Bank Operations Menu **");
            System.out.println("1. Display Information of any Depositor");
            System.out.println("2. Deposit Money to any Account");
            System.out.println("3. Withdraw Money from any Account");
            System.out.println("4. Change Address of any Depositor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number to display information: ");
                    int accNum = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountNumber() == accNum) {
                            accounts[i].displayInfo();
                            found = true;
                            break;}      }
                    if (!found) {
                        System.out.println("Account not found.");}
                    break;                case 2:
                    System.out.print("Enter Account Number to deposit money: ");
                    accNum = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountNumber() == accNum) {
                            accounts[i].deposit(depositAmount);
                            accounts[i].displayInfo();
                            found = true;
                            break;}      }
                    if (!found) {
                        System.out.println("Account not found.");}
                    break; 
                case 3:
                    System.out.print("Enter Account Number to withdraw money: ");
                    accNum = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountNumber() == accNum) {
                            accounts[i].withdraw(withdrawAmount);
                            accounts[i].displayInfo();
                            found = true;
                            break;}      }
                    if (!found) {
                        System.out.println("Account not found.");}
                    break; 
                case 4:
                    System.out.print("Enter Account Number to change address: ");
                    accNum = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter new Address: ");
                    String newAddress = sc.nextLine();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (accounts[i].getAccountNumber() == accNum) {
                            accounts[i].changeAddress(newAddress);
                            accounts[i].displayInfo();
                            found = true;
                            break;}            }
                    if (!found) {
                        System.out.println("Account not found.");} 
                    break; 
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    break; 
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;} 
        } while (choice != 5); 
        sc.close();}      }


