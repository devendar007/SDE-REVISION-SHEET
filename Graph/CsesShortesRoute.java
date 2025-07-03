import java.util.*;
public class CsesShortesRoute {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
      List<List<int[]>> adj=new ArrayList<>();
      for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<m;i++){
           int u=sc.nextInt()-1;
           int v=sc.nextInt()-1;
           int w=sc.nextInt();
           adj.get(u).add(new int[]{v,w});
          

        }
        long dist[]=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        dist[0]=0;
        pq.add(new long[]{0,0});
        while(pq.size()!=0){
            long temp[]=pq.poll();
            int u=(int)temp[0];
            long w=temp[1];
            
            for(int it[]:adj.get(u)){
                int v=it[0];
                int nW=it[1];
                if(nW+dist[u]<dist[v]){
                    dist[v]=nW+dist[u];
                    pq.add(new long[]{v,dist[v]});

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(dist[i]+" ");
        }

    }
    
}
