package String;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "love";
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            char ch = s.charAt(left);
            char ch1 = s.charAt(right);
            if(ch==ch1) {
                left++;
                right--;
            }else{
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
