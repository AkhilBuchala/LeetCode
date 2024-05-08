import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int N = score.length;
        int[] copy = new int[N];
        System.arraycopy(score, 0, copy, 0, N);
        
        Arrays.sort(copy);
        // Sort copy array in reverse order
        Integer[] copyInteger = Arrays.stream(copy).boxed().toArray(Integer[]::new);
        Arrays.sort(copyInteger, Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            copy[i] = copyInteger[i];
        }
        
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < N; i++) {
            store.put(copy[i], i);
        }
        
        String[] result = new String[N];
        
        for (int i = 0; i < N; i++) {
            int val = store.get(score[i]);
            if (val == 0) {
                result[i] = "Gold Medal";
            } else if (val == 1) {
                result[i] = "Silver Medal";
            } else if (val == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = Integer.toString(val + 1);
            }
        }
        
        return result;
    }
}
