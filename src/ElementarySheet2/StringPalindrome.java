package ElementarySheet2;
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fg = sc.nextLine();
        int ans = dfbhkj(fg);
        System.out.println(ans);

    }
    static int dfbhkj(String input1){
        String str = input1.toUpperCase();
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String str2 = sb.toString();
        if(str.equals(str2)) return 2;
        else return 1;
    }
}
