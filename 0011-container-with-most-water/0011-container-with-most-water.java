class Solution {
    public int maxArea(int[] height) {
        int max = 1;
        int ans = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int width = j-i;
            if(height[i]<height[j]) {
                max = height[i] * width;
                ans = Math.max(ans,max);
                i++;
            }

            else if (height[i]>height[j]) {
                max= height[j] * width;
                ans=Math.max(ans,max);
                j--;
            }
            else {
                 max = height[i] * width;
                ans = Math.max(ans,max);
                i++;
            }
        }

        return ans;      
    }
}