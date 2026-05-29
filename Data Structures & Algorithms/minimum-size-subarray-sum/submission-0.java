class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int i = 0; 
        int ans = Integer.MAX_VALUE;
        int s = 0; 

        
        for (int j = 0; j < nums.length; j++) {
            s += nums[j];

     
            while (s >= target) {
                ans = Math.min(ans, j - i + 1);
                s -= nums[i]; 
                i++;          
            }
        }

        
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}