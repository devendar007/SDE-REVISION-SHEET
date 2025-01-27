
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head2=new ListNode(-1);
        ListNode temp=head2;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
           
                temp.next=t1;
                t1=t1.next;
                temp=temp.next;
            }
            else{

             temp.next=t2;
             t2=t2.next;
             temp=temp.next;
            }
        }
        if(t1!=null) temp.next=t1;
        if(t2!=null) temp.next=t2;
        return head2.next;
       
    }
}