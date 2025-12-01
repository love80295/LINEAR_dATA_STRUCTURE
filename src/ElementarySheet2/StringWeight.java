package ElementarySheet2;
import java.util.*;
public class StringWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sv = sc.nextLine();
        int input2 = sc.nextInt();
        int ans = fbhj(sv , input2 );
        System.out.println(ans);

    }
    static int fbhj(String input1 , int input2){
        String s = input1.toUpperCase();
        ArrayList<Character> list = new ArrayList<>();
        int sum = 0;
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch==' ') continue;

            int ascci = (int)(ch);
            if(ch>='A' && ch<='Z') {
                int val = ascci - 65 + 1;
                if(input2==0){
                    if(!list.contains(ch)) sum = sum+val;
                }else{
                    sum = sum+val;
                }
            }


        }
       return sum;
    }
}
