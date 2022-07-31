import java.util.Scanner;

public class SearchinMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<r;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int a=in.nextInt();
        if(SearchinMatrix(arr,a)){
            System.out.println("Target is found in  Matrix");
        }
        else{
            System.out.println("Target is not found in  Matrix");
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
}
