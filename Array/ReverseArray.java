import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        in.close();
        reverse(arr);
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);


    }
    public static void reverse(int[] arr) {
        int l =0;
        int h=arr.length-1;
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;

        }
    }
}
