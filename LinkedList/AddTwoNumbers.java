
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prev=0;
        
        ListNode ans=new ListNode(100);
        ListNode temp=ans;
        while(l1!=null||l2!=null||prev!=0){
            int sum=prev;
            if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int value=sum%10;
            prev=sum/10;
          ListNode dummy=new ListNode(value);
          temp.next=dummy;
          temp=temp.next;
        }
        return ans.next;
    }
}