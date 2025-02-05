class Solution {
    public double helper(double p,int q){
        if(q==0) return 1;
        double smallans=helper(p,q/2);
        if(q%2==0){
            return smallans*smallans;
        }
        else return p*smallans*smallans;
    }
    public double myPow(double x, int n) {
      double ans= helper(x,Math.abs(n));
        if(n<0) return 1.0/ans;
        return ans;
    }
}