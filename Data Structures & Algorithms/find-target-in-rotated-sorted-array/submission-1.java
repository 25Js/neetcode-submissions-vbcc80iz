class Solution {
    public int search(int[] nums, int target) {
         int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int m = i + (j - i) / 2;

            // Target found
            if (nums[m] == target) {
                return m;
            }

            // Left half is sorted
            if (nums[i] <= nums[m]) {
                // Target lies in the left sorted half
                if (target >= nums[i] && target < nums[m]) {
                    j = m - 1;
                } else {
                    i = m + 1;
                }
            }
            // Right half is sorted
            else {
                // Target lies in the right sorted half
                if (target > nums[m] && target <= nums[j]) {
                    i = m + 1;
                } else {
                    j = m - 1;
                }
            }
        }

        return -1;
    }
}
