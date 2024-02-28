import java.util.Collections;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left =1;
        int right = piles[0];
      
        for(int i=1;i<piles.length;i++) {
            if(piles[i]>right){
                right=piles[i];
            }
        }
        
        int result = right;
       
        while(left<=right){
            int hours = 0;
            int mid = (left+right)/2;
          
            for(int pile:piles){
                hours += Math.ceil((double) pile / mid);
            }
          
            if(hours<=h){
                result = Math.min(result,mid);
                right = mid-1;             
            } else {
                left = mid+1;
            }
            
        }
        
        return result;
    
        
    }
}