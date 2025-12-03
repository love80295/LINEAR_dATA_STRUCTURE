package ElementarySheet3;
import java.util.*;
public class PowerOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        int[]arr = new int[str.length()];
        for(int i = 0 ; i<str.length() ; i++){
            arr[i] = str.charAt(i) -'0';
        }
        int sum = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            sum = sum + (int)(Math.pow(arr[i] , arr[i+1]));

        }
        sum+=1;
        System.out.println(sum);
    }

}
