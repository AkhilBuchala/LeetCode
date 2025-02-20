import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num:nums) {
            store.add(num);
        }

        int longestStreak = 0;

        for(int num: store) {
            if(!store.contains(num-1)) {
                int current = num;
                int currentStreak = 1;

                while(store.contains(current+1)) {
                    current++;
                    currentStreak++;
                }

                if(currentStreak>longestStreak) {
                    longestStreak = currentStreak;
                }
            }
        }

        return longestStreak;
     
    }
}