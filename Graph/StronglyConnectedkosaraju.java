class Solution {
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]) dfs(it,adj,vis);
        }
    }
    public void dfsfill(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[],Stack<Integer> st){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]) dfsfill(it,adj,vis,st);
        }
        st.add(node);
    }
   
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        
        int n=adj.size();
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]) dfsfill(i,adj,vis,st);
        }
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<>();
        for(int i=0;i<n;i++) adj2.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int it:adj.get(i)){
                adj2.get(it).add(i);
            }
        }
        int count=0;
        Arrays.fill(vis,false);
        while(st.size()!=0){
            int node=st.pop();
            if(!vis[node]) {
                count++;
                dfs(node,adj2,vis);
            }
        }
        return count;
    }
}