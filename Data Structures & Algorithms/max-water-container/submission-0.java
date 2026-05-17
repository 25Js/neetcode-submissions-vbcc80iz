class Solution {
    public int maxArea(int[] heights) {
        int m=Integer.MIN_VALUE;
        int a=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            a=(j-i)*Math.min(heights[i],heights[j]);
            m=Math.max(m,a);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return m;

    }
}
