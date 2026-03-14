package STACKS;
import java.util.*;
public class ConsecutiveSsubSecuence {
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        Stack<Integer> st = new Stack<>();
        int len = 0;
        st.push(arr[0]);
        for(int i = 1 ; i<arr.length ; i++){
            if(st.peek()!=arr[i] && len==0){
                st.push(arr[i]);
            } else if(arr[i]==st.peek()) len++;
            else if(st.peek()!=arr[i] && len>0){
                st.pop();
                st.push(arr[i]);
                len = 0;
            }
        }
        System.out.println(st);
    }
}
