class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for(int i =0;i<intervals.length -1; i++) {
            int pre = intervals[i][1];
            int next = intervals[i+1][0];

            if(next<pre) {
                return false;
            }
        }

      
        return true;
    }
}