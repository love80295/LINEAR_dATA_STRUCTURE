package ElementarySheet1;
import java.util.*;
public class nthPrime {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int input1 = sc.nextInt();
          int ans  = nsdfjk(input1);
        System.out.println(ans);
    }
    static int nsdfjk(int input1){
        int count = 0;
        int n1 = 1;
        int n = 2;
        while(count!=input1){
            if(n%n==0){
                n1 = n;
                count++;
            }
            n++;
        }
        return n;
    }
}
