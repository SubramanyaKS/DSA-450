import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        in.close();
        if(palindrome(S)){
            System.out.println(S+ " is palindrome");
        }
        else{
            System.out.println(S+ " is not a palindrome");
        }

    }
    public static boolean palindrome(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(r.equals(s)){
            return true;
        }
        return false;
    }
}