class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<arr.length&&j<dep.length){
            if(arr[i]<=dep[j]){
                count++;
                i++;
                
            }
            else {
                count--;
                j++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
