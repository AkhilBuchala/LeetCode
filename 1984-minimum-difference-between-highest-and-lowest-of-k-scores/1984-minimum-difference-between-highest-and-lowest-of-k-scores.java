import java.util.Arrays;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++) {
            int difference = nums[i+k-1] - nums[i];
            System.out.println(difference);
            result = Math.min(difference,result);
        }
        return result;
        
    }
}
