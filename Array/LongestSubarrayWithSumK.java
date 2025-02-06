public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        long sum=0;
        int maxlen=0;
        int i=0;
        int j=0;
        while(i<a.length){
            sum+=a[i];
            while(i>j&&sum>k){
                sum-=a[j];
                j++;
            }
            if(sum==k) maxlen=Math.max(maxlen,i-j+1);
            i++;

        }
        return maxlen;
    }
}