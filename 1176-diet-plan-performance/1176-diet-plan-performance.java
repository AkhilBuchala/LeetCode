class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
        int points = 0;
        int sum = 0;
        
        for(int i=0;i<calories.length;i++) {
            sum = sum + calories[i];
            if(i>=k-1) {
                if(sum<lower){
                    points--;
                } else if(sum > upper) {points++;}
                sum -= calories[i - k + 1];
            }
            
            
        }
        
        return points;
    }
}


