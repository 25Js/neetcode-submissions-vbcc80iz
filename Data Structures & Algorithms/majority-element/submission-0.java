class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int j:h.keySet()){
            if(h.get(j)>(nums.length/2)){
                return j;
            }
        }
        return -1;
    }
}