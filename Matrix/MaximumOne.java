import java.util.Scanner;

public class MaximumOne {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int m= in.nextInt();
        int n= in.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        in.close();
        System.out.println(maxi(arr,m,n));
    }
    public static int maxi(int[][] arr, int m,int n){
        int res=0;
        int max=0;
        
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            if(c>max){
                res=i;
               // System.out.println("pos"+i);
            }
            
        }
        return res;
    }
}
