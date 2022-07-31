import java.util.*;
public class RotationString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        in.close();
        if(findrotation(str1,str2)){
            System.out.println("Strings are rotations of each other");
        }
        else{
            System.out.printf("Strings are not rotations of each other");
        }
    }
    public static boolean findrotation(String s1,String s2){
        return (s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1);
    }
}
