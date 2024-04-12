class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> store = new HashSet<>();
        for(int i=0; i<nums.length;i++) {
            if(store.contains(nums[i])) return true;
            store.add(nums[i]);
            if(store.size()>k) {
                store.remove(nums[i-k]);
            }
        }
        
        return false;
    }
}