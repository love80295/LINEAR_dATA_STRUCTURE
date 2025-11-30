package HASHSET;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        // insertion ;
        map.put("india" , 150);
        map.put("japan" , 1570);
        map.put("new york" , 234);
        System.out.println(map); // unordered
        map.put("india" , 3452); // updated
        System.out.println(map);
        // search
        System.out.println(map.containsKey("india"));
        // get the value
        System.out.println(map.get("india"));
        System.out.println(map.get("vcht"));
        // example of for each loop
        int[]arr = {1,2,3,4,5,6,7};
        for(int val : arr){
            System.out.print(val+" ");
        }
        // iterating on the map using entry set
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // iteration on the map using set
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

    }
}
