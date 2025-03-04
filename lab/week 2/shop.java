import java.util.*;

public class shop {

    public static void main(String[] args) {
        int i, choice, flag = 0, index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of customers you want to enter:");
        int numCustomer = scanner.nextInt();
        scanner.nextLine(); 

        ShopingAccount[] accounts = new ShopingAccount[numCustomer];

        for (i = 0; i < numCustomer; i++) {
            System.out.println("Enter the name for customer " + (i + 1) + ":");
            String name = scanner.nextLine();
            accounts[i] = new ShopingAccount(name);
        }

        do {
            System.out.println("Enter the name of the customer:");
            String nameGet = scanner.nextLine();

            for (i = 0; i < numCustomer; i++) {
                flag = 0;
                if (accounts[i].getName().equals(nameGet)) { 
                    flag = 1;
                    index = i;
                    break; 
                }
            }
 
            if (flag == 1) {
                do {
                    System.out.println("Menu: \n1 - Mobile (500)\n2 - Laptop (250)\n3 - Headphone (100)\n4 - Total Bill\n0 - Exit");
                    choice = scanner.nextInt();
                      scanner.nextLine(); 

                    if (choice == 1) {
                        System.out.println("Enter the quantity:");
                        int quant = scanner.nextInt();
                        scanner.nextLine(); 
                        accounts[index].addBill(quant * 500);
                    } else if (choice == 2) {
                        System.out.println("Enter the quantity:");
                        int quant = scanner.nextInt();
                        scanner.nextLine(); 
                        accounts[index].addBill(quant * 250);
                    } else if (choice == 3) {
                        System.out.println("Enter the quantity:");
                        int quant = scanner.nextInt();
                        scanner.nextLine(); 
                        accounts[index].addBill(quant * 100);
                    } else if (choice == 4) {
                        accounts[index].totalBill();
                    } else if (choice == 0) {
                        System.out.println("Exiting...");
                        break; 
                    } else {
                        System.out.println("Invalid choice, please try again.");
                    }
                } while (choice != 0); 
            } else {
                System.out.println("The name is not found.");
                break; 
            }

        } while (true); 

       
    }
}

class ShopingAccount {
    private int bill = 0;
    private String name;

    ShopingAccount(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addBill(int amount) {
        this.bill += amount;
    }

    void totalBill() {
        System.out.println("Total bill is: " + bill);
    }
}
