class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
               max=Math.max(max,prices[i]-min);
         min=Math.min(prices[i],min);
      
        }
     return max;
    }
}