class Solution {
    // Function to flatten a linked list
    Node merge(Node root1,Node root2){
        Node head=new Node(-100);
        Node temp=head;
        while(root1!=null&&root2!=null){
            if(root1.data<root2.data){
                temp.bottom=root1;
                root1=root1.bottom;
                temp=temp.bottom;
            }
            else{
                temp.bottom=root2;
                root2=root2.bottom;
                temp=temp.bottom;
            }
        }
        if(root1!=null) temp.bottom=root1;
        if(root2!=null) temp.bottom=root2;
        return head.bottom;
    }
    Node flatten(Node root) {
   
        Node node=root;
      
        while(root!=null){
           node=merge(node,root.next);
           root=root.next;
        }
        return node;
    }
}
