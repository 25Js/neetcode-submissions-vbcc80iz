class Solution {
    public void sortColors(int[] nums) {
      int l=0;
      int n=0;
      int r=nums.length-1;
      while(n<=r){
        switch(nums[n]){
            case 0:
            int t=nums[n];
            nums[n]=nums[l];
            nums[l]=t;
            l++;
            n++;
            break;
            case 1:
            n++;
            break;
            case 2:
             t=nums[n];
            nums[n]=nums[r];
            nums[r]=t;
            r--;
            break;

        }
      }  
    }
}