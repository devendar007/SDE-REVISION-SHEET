class Solution {
    int max=0;
    public int helper(TreeNode root){
    if(root==null) return 0;
    return 1+Math.max(helper(root.left),helper(root.right));

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        max=Math.max(max,helper(root.right)+helper(root.left));
     diameterOfBinaryTree(root.left);
     diameterOfBinaryTree(root.right);
     return max;
    }
}