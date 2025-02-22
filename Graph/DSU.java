class GfG {
    
    int find(int parent[], int x) {
        // add code here.
        if(x==parent[x]) return x;
        return parent[x]=find(parent,parent[x]);
    }

    void unionSet(int parent[], int x, int z) {
        // add code here.
        int z_parent=find(parent,z);
        int x_parent=find(parent,x);
        if(z_parent==x_parent){
           return;
        }
        int rank[]=new int[parent.length];
        if(rank[x_parent]>rank[z_parent])
          parent[z_parent]=x_parent;
          else if(rank[z_parent]>rank[x_parent]){
              parent[x_parent]=z_parent;
          }
          else {
              parent[x_parent]=z_parent;
              rank[z_parent]++;
          }
    }
}
