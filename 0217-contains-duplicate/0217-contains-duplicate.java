class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(store.containsKey(nums[i])){
                return true;
            } else {
                store.put(nums[i],i);
            }
        }
        return false;

    }
}