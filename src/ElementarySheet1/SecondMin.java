package ElementarySheet1;
import java.util.*;
public class SecondMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[7];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int fmin = arr[0];
        int smin = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]!=fmin){
                smin = arr[i];
                break;
            }
        }
        System.out.println(smin);
    }
}
