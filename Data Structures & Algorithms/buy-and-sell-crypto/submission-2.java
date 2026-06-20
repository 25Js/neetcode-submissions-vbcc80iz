class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int p=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<p){
                p=i;
            }
            if(i-p>profit){
                profit=i-p;
            }
        }
        return profit;
        
    }
}
