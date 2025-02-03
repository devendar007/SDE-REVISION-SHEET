public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int helper(int num){
        int i=0;
        while((num&(1<<i))==0){
            i++;
        }
        return i;
    }
    public int[] repeatedNumber(final int[] A) {
        int ans[]=new int[2];
        int num=0;
        int  n=A.length;
        for(int i=0;i<A.length;i++) num^=A[i];
        for(int i=1;i<=n;i++) num^=i;
        int diffbit=helper(num);
        int x=0;
        int y=0;
        for(int i=1;i<=n;i++){
            if((i&(1<<diffbit))!=0) x^=i;
            else y^=i;
        }
        for(int i=0;i<n;i++){
            if((A[i]&(1<<diffbit))!=0) x^=A[i];
            else y^=A[i];
        }
        for(int i=0;i<n;i++){
            if(x==A[i]){
                return  new int[]{x,y};
            }
        }
        return new int[]{y,x};
     
    }
}
