package HASHSET;
import java.util.*;
public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[]arr = str.toLowerCase().split(" ");
        HashSet<String>set = new HashSet<>();
        for(int i = 0 ; i<arr.length ; i++){
            String s = arr[i];
            if(!set.contains(s)){
                set.add(s);
            }
        }
        Iterator<String> it =  set.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}
