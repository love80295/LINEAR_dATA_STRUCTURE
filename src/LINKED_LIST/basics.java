package LINKED_LIST;
import java.util.*;
public class basics {
    public static class node{
        int data;
        node next;
        node( int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
           node n = new node(5);
        System.out.println(n.next);
        node n1 = new node(6);
        node n2 = new node(7);
        node n3 = new node(8);
        node n4 = new node(9);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        System.out.println(n.next); // LINKED_LIST.basics$node@8efb846
//        System.out.println(n1);
        System.out.println(n.next.data);
        node temp = n;
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp = temp.next;
//        }
        display(n);
        int p = len(n);
        System.out.println(p);


    }
    static void display(node head){
        if(head==null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }
    static int len(node n){
        int count = 0;
        while(n!=null){
            count++;
            n = n.next;
        }
        return count;
    }
}
