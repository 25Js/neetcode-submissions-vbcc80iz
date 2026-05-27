class Solution {
    public int[] replaceElements(int[] arr) {
       int maxSeen = -1; // The rightmost element is always replaced with -1
        
        // Iterate backwards from the last element to the first
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentVal = arr[i];
            arr[i] = maxSeen; // Replace current element with the max seen to its right
            maxSeen = Math.max(maxSeen, currentVal); // Update the max for the next elements to the left
        }
        
        return arr;
            
    }
}