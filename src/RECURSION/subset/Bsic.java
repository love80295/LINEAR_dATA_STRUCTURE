package RECURSION.subset;
import java.util.*;
public class Bsic {
    public static void main(String[] args) {
        sub("abc" , "" , 0);
    }
    static void sub(String s , String str , int index){
        if(index==s.length()){
            System.out.println(str);
            return;
        }
        sub(s, str , index+1);
        sub(s , str+s.charAt(index) , index+1);
    }
}
