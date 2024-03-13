import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int count =1;
        if(nums.length==0){
            return 0;
        }
        
        for(int i=1;i<nums.length;i++) {
            System.out.println(nums[i]);
            if(nums[i]!=nums[i-1]){
                if(nums[i]-1==nums[i-1]) {
                count++;
            } else {
                max=Math.max(count,max);
                count =1;
            }
           
        }
            }
            
        return Math.max(max,count);
      
    }
}