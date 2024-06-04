class Solution {
    public int longestPalindrome(String s) {
        
        char[] str = s.toCharArray();
        HashMap<Character, Integer> store = new HashMap<>();
        int result = 0;
        
        for(int i =0; i<str.length;i++) {
            
            if(store.containsKey(str[i])){
                int val = store.get(str[i]);
                store.put(str[i],val+1);
            } else {
                store.put(str[i],1);
            }
        }
        
        boolean hasOddFrequency = false;
        
        for(Map.Entry<Character,Integer> entry : store.entrySet()) {
            int val = entry.getValue();
            
            if(val%2==0) {
                result = result + val;
            } else {
                result = result + val -1;
                hasOddFrequency = true;
                
            }
            
        }
        
        if(hasOddFrequency) return result +1;
        
        return result;
        
    }
}