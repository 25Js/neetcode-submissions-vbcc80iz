class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
     int dp[]= new int [n+1];
          Arrays.fill(dp,-1);
        int ans=helper(dp,nums,0);
      
        return ans;
    }
    public static int helper(int dp[],int[] n,int i){
        
        if (i >= n.length) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]= Math.max(helper(dp,n,i+2)+n[i],helper(dp,n,i+1));
    }
}
