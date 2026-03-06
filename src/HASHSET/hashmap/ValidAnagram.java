package HASHSET.hashmap;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        String s ="anagram";
        String s2 = "gram";
        System.out.println(anagram(s , s2));
    }
    static boolean anagram(String s1 , String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character , Integer> mp1 = maps(s1);
        HashMap<Character , Integer> mp2 = maps(s2);
        return mp1.equals(mp2);
    }
    static HashMap<Character , Integer> maps(String s){
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                int freq = mp.get(ch);
                mp.put(ch , freq+1);
            }else{
                mp.put(ch , 1);
            }

        }
        return mp;
    }
}
