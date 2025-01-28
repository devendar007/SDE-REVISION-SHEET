public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode fast=head;
      ListNode slow=head;
     while(fast!=null){
        slow=slow.next;
        if(fast.next==null) return null;
        fast=fast.next.next;
      if(fast==slow) break;
     }  
     if(fast==null) return null;
     ListNode temp=head;
     while(temp!=slow){
        temp=temp.next;
        slow=slow.next;
     }
     return temp;
    }
}