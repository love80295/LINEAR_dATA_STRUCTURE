package ElementarySheet2;
import java.util.*;
import java.util.ArrayList;

public class ispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        is(n);

    }
    static void is(int input1){
       int[]arr = new int[10];
       while(input1!=0){
           int digit = input1%10;
           arr[digit] = arr[digit] + 1;
           input1 = input1/10;
       }
       int oddSum = 0;
       for(int i = 0 ; i<arr.length ; i++){
           if(arr[i]%2!=0) oddSum++;
       }
       if(oddSum==1 || oddSum==0){
           System.out.println("possible");
       }else{
           System.out.println("not possible");
       }
    }
}
