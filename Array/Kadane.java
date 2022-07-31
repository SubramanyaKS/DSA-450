
/**
 * Kadane Algorith to find max sum of subarray
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Kadane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        in.close();
        ArrayList<Integer> subarr =new ArrayList<Integer>();
        int l= maxSubArray(arr,subarr);
        System.out.println(l);
        for(int i=subarr.get(0);i<=subarr.get(1);i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int maxSubArray(int[] arr, ArrayList<Integer> subarr) {
        int msf=arr[0],meh=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            meh+=arr[i];
            if(meh>msf){
                subarr.clear();
                msf=meh;
                subarr.add(s);
                subarr.add(i);
            }
            if(meh<0){
                meh=0;
                s=i+1;
            }
        }
        return msf;
    }
}
