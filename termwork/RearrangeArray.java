import java.util.Scanner;
public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     }
        int left = 0;
        int right = n - 1;
        while(left <= right) {
            if(arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--; }
            else if(arr[left] < 0) {
                left++;} 
            else if(arr[right] > 0) {
                right--;}         }
        System.out.print("Rearranged Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); }
        sc.close();  }        }
