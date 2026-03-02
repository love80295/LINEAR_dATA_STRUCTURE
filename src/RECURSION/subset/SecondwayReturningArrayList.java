package RECURSION.subset;
import java.util.*;
public class SecondwayReturningArrayList {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4,8};
        ArrayList<Integer> bsa = na(arr , 4 , 0);
        System.out.println(bsa);
    }
    static ArrayList<Integer> na(int[]arr , int target , int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> list1 = na(arr , target , index+1);
        list.addAll(list1);
        return list;
    }
}
