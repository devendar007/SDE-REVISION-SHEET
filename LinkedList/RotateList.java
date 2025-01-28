
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n=0;
        ListNode temp=head;
        if(head==null) return null;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        k=k%n;
        for(int i=1;i<n-k;i++){
         temp=temp.next;
        }
        if(k==0) return head;
        ListNode nextnode=temp.next;
        temp.next=null;
        ListNode temp2=nextnode;
        while(temp2.next!=null){
         temp2=temp2.next;
        }
        temp2.next=head;
        return nextnode;
    }
}