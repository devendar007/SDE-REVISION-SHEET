class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> st=new HashSet();
     for(int it:nums) st.add(it);
      int max=0;
      for(int it:st){
        if(!st.contains(it-1)){
            int x=it;
            int count=1;
            while(st.contains(x+1)){
                x=x+1;
                count++;
            }
            max=Math.max(max,count);
        }
      }
      return max;
    }
}