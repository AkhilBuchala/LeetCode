class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;
        
        for(int i =0; i<=s.length()-3;i++) {
            String substirng = s.substring(i,i+3);
            boolean check = isGood(substirng);
            if(check) {
                result++;
            }
        }
        
        return result;
    }
    
    private boolean isGood(String t) {
        Set<Character> store = new HashSet<>();
        for(char ch: t.toCharArray()) {
            if(store.contains(ch)) {
                return false;
            }
            store.add(ch);
        }
        return true;
    }
}
