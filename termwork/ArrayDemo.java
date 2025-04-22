import java.util.*;
public class ArrayDemo {
    void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }}
        }
        if (!found) 
            System.out.println("No such pairs found.");
    }

    void arrayFunc(int A[], int p, int B[], int q) {
        int[] merged = new int[p + q];
        for (int i = 0; i < p; i++) {
            merged[i] = A[i];
        }
        for (int i = 0; i < q; i++) {
            merged[p + i] = B[i];
        }
        Arrays.sort(merged);
        for (int i = 0; i < p; i++) {
            A[i] = merged[i];
        }
        for (int i = 0; i < q; i++) {
            B[i] = merged[p + i];
        }
        System.out.println("Sorted Arrays - ");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDemo obj = new ArrayDemo();
        System.out.println("Choose option:");
        System.out.println("1. Find all pairs whose sum is a given number");
        System.out.println("2. Merge two sorted arrays and redistribute");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter size of the array: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("Enter the target sum: ");
                int target = sc.nextInt();
                obj.arrayFunc(arr, target);
                break;
            case 2:
                System.out.print("Enter size of array A: ");
                int p = sc.nextInt();
                int[] A = new int[p];
                System.out.println("Enter " + p + " sorted elements of array A:");
                for (int i = 0; i < p; i++) {
                    A[i] = sc.nextInt();
                }
                System.out.print("Enter size of array B: ");
                int q = sc.nextInt();
                int[] B = new int[q];
                System.out.println("Enter " + q + " sorted elements of array B:");
                for (int i = 0; i < q; i++) {
                    B[i] = sc.nextInt();
                }
                obj.arrayFunc(A, p, B, q);
                break;
            default:
                System.out.println("Invalid option selected.");
        }
        sc.close();
    }
}
