class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        // Maps temperature -> most recent index from the right
        // (Used only to stay close to your original idea.)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stack stores temperatures
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove temperatures that are not warmer
            while (!stack.isEmpty() && stack.peek() <= temperatures[i]) {
                stack.pop();
            }

            // Compute answer
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                int warmerTemp = stack.peek();
                ans[i] = map.get(warmerTemp) - i;
            }

            // Update current temperature -> index
            map.put(temperatures[i], i);

            // Push current temperature onto stack
            stack.push(temperatures[i]);
        }

        return ans;
    }
}
