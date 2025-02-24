class Solution {
    // Function to return list containing vertices in Topological order.
    public static void helper(int node,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,boolean vis[]){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]) helper(it,adj,st,vis);
        }
        st.add(node);
        
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                helper(i,adj,st,vis);
            }
        }
       
        while(st.size()>0){
            ans.add(st.pop());
        }
        return ans;
    }
}