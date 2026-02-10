package RECURSION.Strings;
import java.util.*;
public class SkipCharacter {
    public static void main(String[] args) {
        String s = "absbfbsdbsaaa";
        System.out.println(nc(s , "" , 0));
    }
    static String nc(String s , String str , int i ){
        if(i==s.length()){
            return str;
        }
       if(s.charAt(i)=='a'){
           return nc(s ,str  , i+1);
       }
       return nc(s , str + s.charAt(i) , i+1);
    }
}
