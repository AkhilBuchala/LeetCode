class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();

        for(int i=0;i<=nums.length-1 ; i++) {
            if(store.containsKey(nums[i])) {
                int val = store.get(nums[i]);
                store.put(nums[i],val+1);
            } else {
                store.put(nums[i],1);
            }
        }

        int majorityElement = 0;
        int majorityOccurance = 0;
        for(Map.Entry<Integer,Integer> i : store.entrySet() ) { 

            if(i.getValue() >  majorityOccurance) {
                majorityOccurance = i.getValue();
                majorityElement = i.getKey();
            }

        }

        return majorityElement;

        

    }
}