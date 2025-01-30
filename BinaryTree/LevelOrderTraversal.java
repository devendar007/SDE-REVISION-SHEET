class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()!=0){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            while(n-->0){
                TreeNode x=q.poll();
                 temp.add(x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}