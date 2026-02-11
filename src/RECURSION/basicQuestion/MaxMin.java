package RECURSION.basicQuestion;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[]arr = {1,4,3,-5,-4,8,6};
        System.out.println(Arrays.toString(maxmin(arr , max , min , 0)));

    }
    static int[] maxmin(int[]arr , int max , int min ,  int index){
        if(index==arr.length){
            int[]brr = new int[2];
            brr[0] = min;
            brr[1] = max;
            return brr;
        }
        if(arr[index]<min){
            min = arr[index];
           // return maxmin(arr , max , min , index+1);
        }else if(arr[index]>max){
            max = arr[index];
           // return maxmin(arr , max , min , index+1);
        }
        return maxmin(arr , max , min , index+1);


    }
}
