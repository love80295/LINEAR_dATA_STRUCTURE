package RECURSION.subset;
import java.util.*;
public class LIstSubset {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       ArrayList<String> result = sub("abc" , "" , list);
        System.out.println(list);
    }
     static  ArrayList<String> sub(String s , String s1 , ArrayList<String> list){
        if(s.isEmpty()){
            list.add(s1);
            return list;
        }
        char ch = s.charAt(0);
          sub(s.substring(1) , s1+ch , list);
          sub(s.substring(1) , s1 , list);

          return list;

     }
}

