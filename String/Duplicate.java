import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Duplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S=in.nextLine();
        in.close();
        duplicateelement(S);
        
    }
    public static void duplicateelement(String s){
        HashMap<Character,Integer> c = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!c.containsKey(s.charAt(i))){
                c.put(s.charAt(i), 1);
            }
            else{
                c.put(s.charAt(i), c.get(s.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> me : c.entrySet()){
            char k=(char)me.getKey();
            int v=((int)me.getValue());
            if(v>1){
                System.out.println(k+" count= "+v);
            }
        }
    }
}