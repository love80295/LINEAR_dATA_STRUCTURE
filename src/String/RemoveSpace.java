package String;
import java.util.*;
public class RemoveSpace {
    public static void main(String[] args) {
        String s = "love agrawal btech";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch==' ') continue;
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
