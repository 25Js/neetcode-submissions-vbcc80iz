class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int ans=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!h.contains(i)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}