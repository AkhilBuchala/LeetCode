import java.util.Collection;
class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();

        for(int num : nums) {
            store.put(num,store.getOrDefault(num,0)+1);
        }

        int result = 0;

        for(Integer single: store.values()) {
            int n = single.intValue();
            int sum = n*(n-1)/2;
            result = result + sum;
        }
        return result;    
    }
}