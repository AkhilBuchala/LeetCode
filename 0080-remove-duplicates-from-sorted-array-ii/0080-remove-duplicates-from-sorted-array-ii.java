class Solution {
     public int[] removeElement(int[] arr, int i) {
        for(int j = i+1; j<arr.length;j++) {
            arr[j-1]=arr[j];
        }
        return arr;
    }
    public int removeDuplicates(int[] nums) {
        int count = 1; 
        int i = 1;
        int len = nums.length;
        while(i<len) {
            if(nums[i]==nums[i-1]) {
                count++;
                
                if(count>2) {
                    this.removeElement(nums,i);
                    i--;
                    len--;
                    
                }
                
            } else {
                count = 1;
            }
            i++;
        }
        
        return len;
        
    }
}
   