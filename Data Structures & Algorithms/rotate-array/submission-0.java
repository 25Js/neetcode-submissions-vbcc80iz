class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n;
         reverse(nums, 0, n-1);    
    reverse(nums, 0, k-1);     
    reverse(nums, k, n-1);      
    }
    public static void reverse(int [] n, int i, int j){
        while(i<j){
            int t=n[i];
            n[i]=n[j];
            n[j]=t;
            i++;
            j--;
        }
    }
}