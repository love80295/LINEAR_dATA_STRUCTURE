package String;
import java.util.*;
public class VowelsConsonenets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        int v = 0 , c = 0 , n = 0;
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u') v++;
                else c++;
            }else{
                n++;
            }
        }
        System.out.println(v+ " " + c +" " + n);
    }
}
