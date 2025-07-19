class Solution {
    public boolean findSubarrays(int[] nums) {
         HashSet<Integer> store = new HashSet<Integer>();

        for(int i =0 ; i < nums.length - 1; i++) {
            int val = nums[i] + nums[i+1];

            if(store.contains(val)) {
                return true;
            } else {
                store.add(val);
            }
        }

        return false;
    }
}