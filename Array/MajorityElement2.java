class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int ele1=(int)1e9+1;
       int ele2=(int)1e9+1;
       int count1=0;
       int count2=0;
       for(int i=0;i<nums.length;i++){
        if(count1==0&&ele2!=nums[i]){
            ele1=nums[i];
            count1=1;
        }
        else if(count2==0&&ele1!=nums[i]){
        ele2=nums[i];
        count2=1;
       } 
       else if(nums[i]==ele1) count1++;
       else if(nums[i]==ele2) count2++;
       else{
        count1--;
        count2--;
       }}
       List<Integer> ans=new ArrayList<>();
     count1=0;
     count2=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==ele1) count1++;
        if(nums[i]==ele2) count2++;
       }
       if(count1>nums.length/3) ans.add(ele1);
       if(count2>nums.length/3) ans.add(ele2);
       return ans; 
    }
}