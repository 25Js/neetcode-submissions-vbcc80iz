class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]= new int[nums.length];
        int i=0;
        int j=1;
         int k=0;
         while(k<nums.length){
            if(nums[k]>=0){
                a[i]=nums[k];
                i+=2;
            }else{
                a[j]=nums[k]; 
                j+=2;
            }
            k++;
         }
         return a;
    }
}