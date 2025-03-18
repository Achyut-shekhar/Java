import java.util.Scanner;
public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();}         }
        boolean saddlePointFound = false;
        for(int i = 0; i < n; i++) {
            int minRow = mat[i][0];
            int colIndex = 0;
            for(int j = 1; j < n; j++) {
                if(mat[i][j] < minRow) {
                    minRow = mat[i][j];
                    colIndex = j;}        }
            boolean isSaddlePoint = true;
            for(int k = 0; k < n; k++) {
                if(mat[k][colIndex] > minRow) {
                    isSaddlePoint = false;
                    break;}             }
            if(isSaddlePoint) {
                System.out.println("Saddle Point Found at: (" + i + ", " + colIndex + ")");
                System.out.println("Saddle Point Value: " + minRow);
                saddlePointFound = true;
                break;}       }
        if(!saddlePointFound) {
            System.out.println("No Saddle Point Found"); }
        sc.close();}         }

