import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;
        
        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (isGood(substring)) {
                result++;
            }
        }
        
        return result;
    }
    
    private boolean isGood(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
