package STACKS;
import java.util.*;
public class copyOfStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        Stack<Integer> st3 = new Stack<>();
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        System.out.println(st3);

    }
}
