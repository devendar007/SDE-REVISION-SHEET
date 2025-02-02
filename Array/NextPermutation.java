class Solution {
    public void reverse(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,nums.length-1);
        }
        else{
             for(int i=nums.length-1;i>idx;i--){
                 if(nums[i]>nums[idx]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                 }
             }
             reverse(nums,idx+1,nums.length-1);
        }
    }
}