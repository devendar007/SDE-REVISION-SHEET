
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode temp=head;
    ListNode prev=null;
    ListNode nxt=null;
    while(temp!=null){
        ListNode t=temp;
    for(int i=1;i<k;i++){
        if(t==null) return head;
        t=t.next;
    }
    if(t==null) return head;
    nxt=t.next;
    t.next=null;
    ListNode rev=reverse(temp);
    if(temp==head) head=rev;
  if(prev!=null)  prev.next=rev;
    temp.next=nxt;
    prev=temp;
    temp=nxt;

    }
    return head;
    }
}