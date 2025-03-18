import java.util.Scanner;
public class PatternCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary string (0's and 1's): ");
        String str = sc.next();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                int j = i + 1;
                while(j < str.length() && str.charAt(j) == '1') {
                    j++;}
                if(j < str.length() && str.charAt(j) == '0') {
                    count++;
                    i = j - 1;}        }           }
        System.out.println("Total patterns of 0(1+)0 found: " + count);
        sc.close();}           }
