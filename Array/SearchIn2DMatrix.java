class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0;
        int end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int ele=matrix[mid/m][mid%m];
            if(ele==target) return true;
            else if(ele>target){
                end=mid-1;
            }
            else st=mid+1;

        }
        return false;
    }
}