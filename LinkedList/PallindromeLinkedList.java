class Solution {
    public ListNode rev(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    ListNode nxt=null;
    while(curr!=null){
    nxt=curr.next;
    curr.next=prev;
    prev=curr;
    curr=nxt;
    }
    return prev;
    }
    public boolean isPalindrome(ListNode head) {
      int n=0;
      ListNode temp=head;
      while(temp!=null){
        n++;
        temp=temp.next;
      }  
      temp=head;
      for(int i=1;i<=n/2;i++) temp=temp.next;
      ListNode head2=rev(temp);
      temp=head;
      while(head2!=null){
        if(temp.val!=head2.val) return false;
        temp=temp.next;
        head2=head2.next;
      }
      return true;
    }
}