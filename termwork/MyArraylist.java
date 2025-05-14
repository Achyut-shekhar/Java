import java.util.ArrayList;
import java.util.Scanner;

public class MyArraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter the number of strings you want to add to the list:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list.add(str);
        }

        removeEvenLength(list);

        System.out.println("List after removing even length strings: " + list);

        sc.close(); // Good practice to close the scanner
    }

    // Removes strings with even lengths from the list
    public static void removeEvenLength(ArrayList<String> list) {
        // Traverse backward to avoid skipping elements when removing
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
