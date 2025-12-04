package ElementarySheet2;
import java.util.*;
public class Pin_creation {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input1 , input2 , input3;
            input1 = sc.nextInt();
            input2 = sc.nextInt();
            input3 = sc.nextInt();
            int ans = hjfdg(input1 , input2 , input3);
        System.out.println(ans);
    }
    static int hjfdg(int input1 , int input2 , int input3){
        int sum = 0;
        int greatest = 0;
        while(input1!=0 || input2!=0 || input3!=0){
            int rem1 , rem2 , rem3;
            rem1 = input1%10;
            rem2 = input2%10;
            rem3 = input3%10;
            sum = sum*10 + Math.min(rem1 , Math.min(rem2,rem3));
            if(Math.max(rem1 , Math.max(rem2 , rem3))>greatest) greatest = Math.max(rem1 , Math.max(rem2 , rem3));

            input1 = input1/10;
            input2 = input2/10;
            input3 = input3/10;
        }
        sum = sum*10 + greatest;
        StringBuilder sb = new StringBuilder(sum + "");
        sb.reverse();
        if(sb.length()<4){
            sb.append('0');
        }


        return Integer.valueOf(sb.toString());
    }
}
