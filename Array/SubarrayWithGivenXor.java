public class Solution {
    public int solve(int[] A, int k) {
        long xor=0;
        HashMap<Long,Integer> mp=new HashMap<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            xor^=A[i];
            if(xor==k) count++;
            long rem=xor^k;
            if(mp.containsKey(rem)){
               count+=mp.get(rem);
            }
            mp.put(xor,mp.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
