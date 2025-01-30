class Solution {
    int max=Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root==null) return 0;
    
        int lsum=Math.max(0,helper(root.left));
        int rsum=Math.max(0,helper(root.right));
       max=Math.max(max,root.val+lsum+rsum);
       return root.val+Math.max(lsum,rsum);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
}