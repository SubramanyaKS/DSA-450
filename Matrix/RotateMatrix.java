import java.util.*;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n= in.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        in.close();
        reverseMatrix(arr,n);
    }
    public static void reverseMatrix(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
