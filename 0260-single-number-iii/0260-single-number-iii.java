class Solution {
    public int[] singleNumber(int[] nums) {
        
        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<Integer,Integer> store = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            if(store.containsKey(nums[i])) {
                int val = store.get(nums[i]);
                store.put(nums[i],val+1);
            } else {
                store.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : store.entrySet()){
            if(entry.getValue()==1){
                resultList.add(entry.getKey());
            }
        }
        int[] result = resultList.stream().mapToInt(i -> i).toArray();
        return result;
        
    }
}