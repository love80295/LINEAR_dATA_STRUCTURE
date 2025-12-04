package HASHSET;
import java.util.*;
public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
