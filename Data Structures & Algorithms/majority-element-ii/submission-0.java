class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int i: h.keySet()){
            if(h.get(i)>(nums.length/3)){
                l.add(i);
            }
        }
        return l;
    }
}