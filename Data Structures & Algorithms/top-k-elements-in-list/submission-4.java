class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((c,d)->{
            return Integer.compare(c[1],d[1]);
        });
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for (int key : h.keySet()) {
            p.offer(new int[] {key, h.get(key)});
            if (p.size() > k) {
                p.poll(); 
            }
        }
        int ans[]= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=p.poll()[0];
        }
        return ans;
    }
}
