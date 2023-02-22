import java.util.*;
public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int n= in.nextInt();
	    int arr [] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
        in.close();
	    sortDutch(arr, n);
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
        }
    }
    public static void sortDutch(int[] arr, int n){
	    int l=0;
	    int temp=0;
	    int h=n-1;
	    int mid=0;
	    
	    while(mid<=h){
	        switch(arr[mid]){
	            case 0:
	                temp=arr[l];
	                arr[l]=arr[mid];
	                arr[mid]=temp;
	                l++;
	                mid++;
	                break;
	                
	               case 1:
	                   mid++;
	                   break;
	                   
	               case 2:
	                   temp=arr[mid];
	                   arr[mid]=arr[h];
	                   arr[h]=temp;
	                   h--;
	                   break;
	        }
	    }
	}

}
