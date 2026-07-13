class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 PriorityQueue<int[]> p = new PriorityQueue<>((c,d)->{
    return Integer.compare(c[1],d[1]);
 });
 HashMap<Integer,Integer> h = new HashMap<>();
 for(int i: nums){
    h.put(i,h.getOrDefault(i,0)+1);
 }
 for(int i:h.keySet()){
    p.offer(new  int[]{i,h.get(i)});
    if(p.size()>k){
        p.poll();
    }
 }
 int a[]= new int[k];
 for(int i=0;i<k;i++){
  a[i]=p.poll()[0];
 }
 return a;


    }
}
