package HASHSET.hashmap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("love" , 345);
        map.put("sudarshan" , 345768);
        System.out.println(map.get("love"));
        System.out.println(map.containsKey("sudarshan"));
    }
}
