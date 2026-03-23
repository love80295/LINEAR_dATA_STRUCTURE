package STACKS;
import java.util.*;
public class Nextgreater {
    public static void main(String[] args) {
        int[]arr = {1,3,2,1,8,6,3,4};
        int[]result = new int[arr.length];
        result[result.length-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(st.peek()>arr[i]){
                result[i] = st.peek();
                st.push(arr[i]);
            }else{
                result[i] = -1;
                while(!st.isEmpty()){
                    if(st.peek()>arr[i]){
                        result[i] = st.peek();
                        st.push(arr[i]);
                        break;
                    }else{
                        st.pop();
                    }
                }
            }
            if(st.isEmpty()) st.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
