public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
     long sn=0,sn2=0,s=0,s2=0;
     int n=A.length;
     sn=(n*(long)(n+1))/2;
     sn2=(n*(long)(n+1)*(2*n+1))/6;
     for(int i=0;i<n;i++){
         s+=(long)A[i];
         s2+=(long)A[i]*A[i];
     }
     long val1=s-sn;
     long val2=s2-sn2;
     val2=val2/val1;
     long x=(val1+val2)/2;
     long y=(val2-val1)/2;
     int ans[]=new int[2];
     ans[0]=(int)x;
     ans[1]=(int)y;
     return ans;
    }
}
