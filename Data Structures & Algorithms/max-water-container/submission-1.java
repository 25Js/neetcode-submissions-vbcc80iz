class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int water=0;
        int max=Integer.MIN_VALUE;
        while(i<j){
            water=Math.abs(i-j)*Math.min(heights[i],heights[j]);
            max=Math.max(max,water);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;

    }
}
