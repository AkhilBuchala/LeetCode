class Solution {
    public int hardestWorker(int n, int[][] logs) {
       int maxTime = logs[0][1] - 0;
       int res = logs[0][0];      

       for (int i = 1; i<logs.length ; i++ ) {
         int currTime = logs[i][1] - logs[i-1][1];

         if(currTime == maxTime){
            res = res < logs[i][0] ? res : logs[i][0];
         } else if(maxTime < currTime ) {
            maxTime = logs[i][1] - logs[i-1][1];
            res = logs[i][0];
         }
       }

       return res;
    }
}