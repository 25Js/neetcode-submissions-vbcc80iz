class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
         HashSet<List<Integer>> h = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int r=nums.length-1;
            while(j<r){
                int s=nums[i]+nums[j]+nums[r];
                if(s==0){
                    h.add(Arrays.asList(nums[i],nums[j],nums[r]));
                    j++;
                    r--;
                }
                else if(s>0){
                    r--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(h);
    }
}
