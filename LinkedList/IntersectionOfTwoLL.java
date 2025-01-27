public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int n1=0,n2=0;
        while(temp1!=null){
        n1++;
        temp1=temp1.next;
        }
       while(temp2!=null){
        n2++;
        temp2=temp2.next;
       }
       if(n1<n2){
       return getIntersectionNode( headB, headA);
       }
       int k=n1-n2;
      temp1=headA;
      temp2=headB;
      for(int i=0;i<k;i++) temp1=temp1.next;
      while(temp1!=null){
        if(temp1==temp2) return temp1;
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return temp1;

           }
}