class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        while(j<nums.length){
        if(nums[i]==nums[j]){
            j++;
        }
        else{
            nums[i+1]=nums[j];
            j++;
            i++;
        }
        }
        return i+1;

    }
}