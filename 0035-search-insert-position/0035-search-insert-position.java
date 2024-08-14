class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int pos;
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right) {
            pos = left + (right-left)/2;
            if(nums[pos]==target) return pos;
            if(target<nums[pos]) right = pos-1;
            else left=pos+1;
        }
        return left;
    }
}