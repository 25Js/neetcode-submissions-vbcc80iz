class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
        h.add(i);
        }
        int ans=0;
        int c=0;
        for(int i:h){
            if(!h.contains(i-1)){
                 c=1;
                int f=i;
                while(h.contains(f+1)){
                    c++;
                    f++;
                }
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
