class Solution {
    public int findMaxLength(int[] nums) {
        
        for(int i = 0;i<=nums.length-1; i++) {
            if(nums[i]==0) {
                nums[i]=-1;
            }
        } 

        HashMap<Integer, Integer> store = new HashMap<>();

        store.put(0,-1);
        int sum =0, res = 0;

        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];

            if(store.containsKey(sum)){
                int last = store.get(sum);
                res = Math.max(i-last, res);
            } else 
            store.put(sum,i);
        
        }

        return res;
    }
}