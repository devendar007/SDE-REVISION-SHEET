class Solution {
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        // Write your code here
        int  n=adj.size();
        ArrayList<Integer> dist=new ArrayList<>();
        for(int i=0;i<n;i++) dist.add((int)1e9);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,src});
        dist.set(src,0);
        while(pq.size()!=0){
            int temp[]=pq.poll();
            int d=temp[0];
            int node=temp[1];
            for(iPair p:adj.get(node)){
                int v=p.first;
                int w=p.second;
                if(w+d<dist.get(v)){
                  dist.set(v,w+d);
                    pq.add(new int[]{dist.get(v),v});
                }
                
            }
        }
        
       return dist;
    }
}