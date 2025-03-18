class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> store = new HashMap<>();
        store.put(0,1);
        int sum = 0, count = 0;

        for(int num: nums) {
            sum = sum + num;

            int mod = sum % k;

            if(mod<0) {
                mod = mod +k;
            }

            if(store.containsKey(mod)) {
                count = count + store.get(mod);
                store.put(mod, store.get(mod)+1);
            } else {
                store.put(mod,1);
            }

        }
        return count;
        
    }
}