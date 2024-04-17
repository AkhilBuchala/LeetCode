class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(store.containsKey(nums[i])) {
                int val = store.get(nums[i]);
                store.put(nums[i],val+1);
            } else {
                store.put(nums[i],1);
            }
        }
        
        int len = 0;
        for(int key: store.keySet()) {
            if(store.containsKey(key+1)) {
                len = Math.max(len, store.get(key)+store.get(key+1));
            }
        }
        
        return len;
    }
}