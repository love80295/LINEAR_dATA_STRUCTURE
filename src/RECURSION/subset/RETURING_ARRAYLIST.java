package RECURSION.subset;
import java.util.*;
public class RETURING_ARRAYLIST {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,8};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> ba = ra(arr , 4 , 0 ,list1 );
        System.out.println(ba);
    }
    static ArrayList<Integer> ra(int[]arr , int target , int index , ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return ra(arr , target , index+1 , list);

    }
}
