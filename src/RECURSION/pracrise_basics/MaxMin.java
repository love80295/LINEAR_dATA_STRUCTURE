package RECURSION.pracrise_basics;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        int[]arr = {1,4,3,-5,-4,8,6};
        int[]brr = arr(arr , Integer.MAX_VALUE , Integer.MIN_VALUE , 0);
        System.out.println(Arrays.toString(brr));
    }
    static int[] arr(int[]arr , int min , int max , int index){
        if(index == arr.length){
            int []narr = new int[2];
            narr[0] = min;
            narr[1] = max;
            return narr;
        }
        if(arr[index]<min){
            min = arr[index];
            return arr(arr , min  , max , index+1);
        }
        if(arr[index]>max){
            max = arr[index];
            return arr(arr , min  , max , index+1);
        }
        return arr(arr , min  , max , index+1);
    }
}
