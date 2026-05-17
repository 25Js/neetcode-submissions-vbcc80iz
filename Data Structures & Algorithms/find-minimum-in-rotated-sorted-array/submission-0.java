class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int m=i+(j-i)/2;
            if(nums[i]<=nums[m] && nums[i]>nums[j]){
                 i=m+1;
            }
            else{
                j=m;
            }
        }
        return nums[i];
    }
}
