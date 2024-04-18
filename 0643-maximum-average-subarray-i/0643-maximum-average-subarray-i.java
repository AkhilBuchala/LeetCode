class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int range = k - 1;
        double result = Integer.MIN_VALUE; 
        
       
        if (nums.length == 1) {
            return (double) nums[0];
        }
        
       
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        
        result = Math.max(result, sum / k);
        
       
        for (int i = 1, j = k; j < nums.length; i++, j++) {
           
            sum -= nums[i - 1];
           
            sum += nums[j];
           
            result = Math.max(result, sum / k);
        }
        
        return result;
    }
}
