class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot, the left plot, and the right plot are all empty
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant the flower
                    n--; // One less flower left to plant
                    
                    if (n <= 0) {
                        return true; // Early exit if we've planted all required flowers
                    }
                }
            }
        }
        
        return n <= 0;

    }
}