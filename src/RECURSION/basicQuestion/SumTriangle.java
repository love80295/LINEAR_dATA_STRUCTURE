package RECURSION.basicQuestion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int[]brr = new int[arr.length-1];
        //System.out.println(Arrays.toString(A(arr,brr)));
        A(arr , brr);
    }
    static int[] A(int[]arr , int[]brr){
        System.out.println(Arrays.toString(arr));
        if(brr.length<1){
            return arr;
        }
        for(int i = 0 ; i<brr.length ; i++){
            brr[i] = arr[i] + arr[i+1];
        }
        int[]brr1 = new int[brr.length-1];
        return A(brr , brr1 );

    }
}
