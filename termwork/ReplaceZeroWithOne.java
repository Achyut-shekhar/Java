import java.util.Scanner;
public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String strNum = Integer.toString(num);
        String replacedNum = strNum.replace('0', '1');
        int result = Integer.parseInt(replacedNum);
        System.out.println("Output: " + result);
        sc.close(); }   }

