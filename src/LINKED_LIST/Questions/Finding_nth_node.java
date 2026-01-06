package LINKED_LIST.Questions;

public class Finding_nth_node {
    public static void main(String[] args) {
           linkedList ll = new linkedList();
           node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ll.display(a);
       a =  ll.deleteFromEnd(a,5);
        ll.display(a);



    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
         public static node nodet(node head , int n){
             node slow = head;
             node fast = head;
             for(int i = 0 ; i<n ; i++){
                 fast = fast.next;
             }
             while(fast!=null){
                 fast = fast.next;
                 slow = slow.next;
             }
             return slow;
         }
         public static node deleteFromEnd(node head , int n){
             node slow = head;
             node fast = head;
             for(int i = 0 ; i<n ; i++){
                 fast = fast.next;
             }
             if(fast==null){
                 head = head.next;
                 return head ;

             }
             while(fast.next!=null){
                 fast = fast.next;
                 slow = slow.next;
             }
              slow.next = slow.next.next;
             return head;
         }
         public static void display(node head){
             node temp = head;
             while(temp!=null){
                 System.out.print(temp.data + " ");
                 temp = temp.next;
             }
             System.out.println();
         }
    }
}
