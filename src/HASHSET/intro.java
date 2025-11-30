package HASHSET;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // creation of hashset
        set.add(3); // adding elements to the set
        set.add(2);
        set.add(3); // only uniq elements will be added
        set.contains(5) ; // seach karta h
        set.remove(3); // remove karta h
        System.out.println(set.contains(3));
        System.out.println(set.size()); // size return karta h
        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);
        // iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
