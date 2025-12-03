package HASHSET;
import java.util.*;
public class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

              set.add(ch);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        int ans = set.size();
        System.out.println(ans);


    }
}
