class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return ans;
        st.add(root);
        while(st.size()!=0){
         int n=st.size();
         while(n-->0){
            TreeNode temp=st.pop();
            ans.add(temp.val);
            if(temp.left!=null) st.add(temp.left);
            if(temp.right!=null) st.add(temp.right);
         }
        }
        Collections.reverse(ans);
        return ans;
    }
}