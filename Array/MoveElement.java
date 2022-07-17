import java.util.Scanner;

/**
 * Move all negative numbers to beginning
 *  and positive to end with constant extra space
 */
/**
 * Approach: Two-Pointer
 */
public class MoveElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        move(arr);
        for(int i = 0; i <n; i++)
        System.out.print(arr[i] + " ");
         
    System.out.println();
    }
    public static void move(int arr[]) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]<0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            else if(arr[left]>0 &&arr[right]>0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }
}