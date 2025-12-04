package HASHSET;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[]arr = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            String s = arr[i];
            if(!list.contains(s)){
                list.add(s);
                list1.add(1);
            }else{
                int index = list.indexOf(s);
                list1.set(index , list1.get(index) + 1);
            }
        }
        for(int i = 0 ; i<list.size() ; i++){
            System.out.println(list.get(i) + " =" + list1.get(i));
        }

    }
}
