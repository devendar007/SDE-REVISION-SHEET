class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int  max=0;
        Set<Character> st=new HashSet<>();
        int n=s.length();
        while(r<n){
          char ch=s.charAt(r);
          while(st.contains(ch)){
            st.remove(s.charAt(l));
            l++;
          }
          st.add(ch);
          max=Math.max(max,st.size());
          r++;
        }
        return max;
    }
}