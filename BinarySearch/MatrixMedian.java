class Solution {
    int getCount(int mat[],int x){
        int st=0;
        int end=mat.length-1;
        int ans=mat.length;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mat[mid]>x){
                ans=mid;
                end=mid-1;
            } 
            else st=mid+1;
            
        }
        return ans;
    }
    int helper(int mat[][],int n,int m,int mid){
        int count=0;
        for(int i=0;i<n;i++){
            count+=getCount(mat[i],mid);
        }
        return count;
        
    }
    int median(int mat[][]) {
        // code here
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=mat.length;
         int m=mat[0].length;    
    
       for(int i=0;i<n;i++) min=Math.min(min,mat[i][0]);
       for(int j=0;j<n;j++) max=Math.max(max,mat[j][m-1]);
       int ans=-1;
       while(min<=max){
           int mid=(min+max)/2;
           int countsmall=helper(mat,n,m,mid);
           if(countsmall>((n*m)/2)) {
               max=mid-1;
               ans=mid;}
           else min=mid+1;
           
       }
        return ans;
        
    }
    
    
}