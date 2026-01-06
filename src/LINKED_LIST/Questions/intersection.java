//public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }

//public class intersection{
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode tempa = headA;
//        ListNode tempb = headB;
//        int lengthA = 0;
//        int lengthB = 0;
//        while(tempa!=null){
//            lengthA++;
//            tempa = tempa.next;
//        }
//        tempa = headA;
//        while(tempb!=null){
//            lengthB++;
//            tempb = tempb.next;
//        }
//        tempb = headB;
//        if(lengthA>lengthB){
//            int steps = lengthA - lengthB;
//            for(int i = 0 ; i<steps ; i++){
//                tempa = tempa.next;
//            }
//        }
//        if(lengthB>lengthA){
//            int steps = lengthB - lengthA;
//            for(int i = 0 ; i<steps ; i++){
//                tempb = tempb.next;
//            }
//        }
//        while(tempa!=tempb){
//            tempa = tempa.next;
//            tempb = tempb.next;
//        }
//        return tempa;
//
//
//    }
//}