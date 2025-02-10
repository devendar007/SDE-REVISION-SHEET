class Solution {
    public int trap(int[] height) {
        //brute force
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
       max=Math.max(max,height[i]);
       leftmax[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rightmax[i]=max;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return ans;
    }
}