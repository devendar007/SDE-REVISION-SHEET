
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       if(head==null) return false;
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==null) return false;
      if(fast==slow) return true;

       }
       return false;
    }
}