import java.util.*;
public class BTBAS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i]=in.nextInt();
        }
        in.close();
        System.out.println(maxProfit(p));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length==1 || prices==null){
            return 0;
        }   
        int result=0;
        int n= prices.length;
        int min=prices[0];
        for(int i=1;i<n;i++){
            result=Math.max(result,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return result;
       }
}
