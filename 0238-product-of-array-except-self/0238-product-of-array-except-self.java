class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] ans = new int[nums.length];
      ans[0] = 1;
      for(int i=1; i<=nums.length-1;i++) {
        ans[i] = nums[i-1]*ans[i-1];
      }

      int suffix = 1;
      for(int i= n-1;i>=0;i--) {
        ans[i] = ans[i]*suffix;
        suffix = suffix * nums[i];
      }
      return ans;

    }
}