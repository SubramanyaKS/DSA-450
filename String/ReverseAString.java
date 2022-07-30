import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        in.close();
        String r=reverseString(S);
        System.out.println(r);
    }
    public static String reverseString(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
}
