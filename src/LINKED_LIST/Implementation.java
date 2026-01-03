package LINKED_LIST;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
           linkedList ll = new linkedList();
           ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        ll.display();
        System.out.println(ll.size);
        ll.insertAtHead(34);
        ll.display();
        ll.insertAt(3,467);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(2);
        ll.display();
        ll.deleteAt(0);
        ll.display();


    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static class linkedList {
        node head = null;
        node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
//        int size() {
//            node temp = head;
//            int count = 0;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
        void insertAtHead(int val){
            node temp = new node(val);
            if(head==null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx , int val){
            node temp = head;
            node t = new node(val);
            if(idx==size){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            }
            for(int i = 1 ; i<idx ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){
            node temp = head;
            for(int i = 0 ; i<idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            node temp = head;
            if(idx==0){
                head = head.next;
                size--;
                return;
            };
            for(int i = 0 ; i<idx-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }
}
