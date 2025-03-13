

// User function Template for Java
class Solution {
    public static int helper(int k,int stalls[]){
        int count=1;
        int prev=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if((stalls[i]-prev)>=k){
                prev=stalls[i];
                count++;
            }
            
        }
        return count;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int min=(int)1e9;
        int max=0;
        for(int i=0;i<stalls.length;i++){
            min=Math.min(min,stalls[i]);
            max=Math.max(max,stalls[i]);
        }
        Arrays.sort(stalls);
        int st=0;
        int end=max-min;
       int ans=-1;
       while(st<=end){
           int mid=st+(end-st)/2;
           if(helper(mid,stalls)>=k){
               ans=mid;
               st=mid+1;
               
           }
           else end=mid-1;
       }
        return ans;
    }
}