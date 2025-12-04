package HASHSET;
import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<list.size() ; i++){
            list.add(sc.nextInt());
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<list.size() ; i++){
            set.add(list.get(i));
        }

    }
}
