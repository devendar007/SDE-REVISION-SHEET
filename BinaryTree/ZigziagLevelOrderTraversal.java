class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
     q.add(root);
     List<List<Integer>> ans=new ArrayList<>();
     if(root==null) return ans;
int i=1;
     while(q.size()!=0){
        int n=q.size();
        List<Integer> temp=new ArrayList<>();
        while(n-->0){
            TreeNode x=q.poll();
             temp.add(x.val);
            if(x.left!=null) q.add(x.left);
            if(x.right!=null) q.add(x.right);

        }
        if(i%2==0) Collections.reverse(temp);
        ans.add(temp);
        i++;
     }      
     return ans;  
    }
}