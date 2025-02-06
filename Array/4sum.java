class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1&&nums[j-1]==nums[j]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l&&nums[l+1]==nums[l]) l--;
                        while(k<l&&nums[k-1]==nums[k]) k++;
                    }
                    else if(sum>target){
                    l--;
                    }
                    else k++;

                }
            }
        }
        return ans;
    }
}