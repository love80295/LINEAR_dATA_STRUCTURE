package HASHSET;
import java.util.*;
public class FilterArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer>list1 = new ArrayList<>();
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i)>50){
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);


    }
}
