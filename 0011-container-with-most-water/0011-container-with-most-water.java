class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result=0;

        while(start<end) {
            int len = end - start;
            if(height[start]<height[end]) {
                int volume = len* height[start];
                 if(volume>result) {  
                    result = volume;
                }
                start++;

            } else if(height[start]>height[end]) {
                int volume = len* height[end];
                if(volume>result) {
                    result = volume;
                }
                end--;
            } else {
                   int volume = len* height[start];
                    if(volume>result) {  
                    result = volume;
                }
                start++;
            }

        }
        return result;
    }
}