class Solution {
    public int[] numberGame(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        Arrays.sort(nums);
        
        for(int i=0 ;i<N;i+=2){
            result[i]= nums[i+1];
            result[i+1]= nums[i];
        }
        return result;
    }
}