class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0});
        boolean vis[]=new boolean[V];
        int sum=0;
        while(pq.size()!=0){
            int temp[]=pq.poll();
            int w=temp[0];
            int node=temp[1];
            if(vis[node]==true) continue;
            vis[node]=true;
            sum+=w;
            for(int it[]:adj.get(node)){
                int neighbour=it[0];
                int wt=it[1];
                if(!vis[neighbour]){
                    pq.add(new int[]{wt,neighbour});
                }
            }
            
        }
        return sum;
    }
}