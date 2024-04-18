class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int range = k - 1;
        double result = Integer.MIN_VALUE; // Start with the minimum possible value
        
        // Handle edge case
        if (nums.length == 1) {
            return (double) nums[0];
        }
        
        // Initialize the sum for the first window
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Initialize result with the average of first window
        result = Math.max(result, sum / k);
        
        // Slide the window and update the sum
        for (int i = 1, j = k; j < nums.length; i++, j++) {
            // Subtract the element going out of the window
            sum -= nums[i - 1];
            // Add the new element coming into the window
            sum += nums[j];
            // Update the result if a higher average is found
            result = Math.max(result, sum / k);
        }
        
        return result;
    }
}
