import java.io.*;
import java.util.Scanner;
public class filehandling {
    public static void main(String[] args) {
        try {
            File file = new File("myfile.txt");
            Scanner sc = new Scanner(file);
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Number of palindromes: " + count);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}



