import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int k= in.nextInt();
        in.close();
        System.out.println(kthSmallest(arr,n,k));
    }
    public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        if(k == 0 || k > n*n || n == 0){
            return -1;
        }
        if(k==1){
            return mat[0][0];
        }
        int low=mat[0][0];
        int high=mat[n-1][n-1];
        while(low<high){
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = n - 1;
            for (int i = 0; i < n; i++) 
            {
                
                while (j >= 0 && mat[i][j] > mid) 
                    j--;
                    
                count += (j + 1);
            }
            
            if(count<k){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }
        return low;   
    }
}
