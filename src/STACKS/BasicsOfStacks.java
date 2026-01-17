package STACKS;
import java.util.*;
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1); // add element in the stack
        st.push(2);
        st.push(3);
        System.out.println(st.peek()); // return the top most element of the stack
        System.out.println(st); // print the whole stack
        st.pop();
        System.out.println(st.size()); // print the size of the stack
        System.out.println(st.isEmpty()); // gives the bollen value
        // if stack is empty gives true
        // if stack is not empty it will give false;

    }
}
