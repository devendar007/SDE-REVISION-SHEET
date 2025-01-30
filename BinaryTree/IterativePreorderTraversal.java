class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> st=new Stack<>();
    List<Integer> ans=new ArrayList<>();
    if(root==null) return ans;
    st.add(root);
    while(st.size()!=0){
        int n=st.size();
        while(n-->0){
            TreeNode temp=st.pop();
            ans.add(temp.val);
            if(temp.right!=null) st.add(temp.right);
            if(temp.left!=null) st.add(temp.left);

        }
    }
    return ans;
    }
}