class Solution {
    public int maxProfit(int[] prices) {
        int p=Integer.MAX_VALUE;
        int profit =0;
        for(int i: prices){
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
