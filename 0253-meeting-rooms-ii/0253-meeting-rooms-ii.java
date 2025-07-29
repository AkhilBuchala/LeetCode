class Solution {
    public int minMeetingRooms(int[][] intervals) {

        PriorityQueue<Integer> allocator = new PriorityQueue<>((a, b) -> a - b);
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        allocator.add(intervals[0][1]);

         for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]>= allocator.peek()) {
                allocator.poll();
            }

            allocator.add(intervals[i][1]);
         }

         return allocator.size();

    
    }
}