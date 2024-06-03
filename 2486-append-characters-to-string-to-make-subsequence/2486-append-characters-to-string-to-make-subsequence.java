class Solution {
    public int appendCharacters(String s, String t) {
        
        int first = 0;
        int minSubToAdd = 0;
        
        while(first<s.length() && minSubToAdd<t.length())  {
            if(s.charAt(first)==t.charAt(minSubToAdd)) {
               
                minSubToAdd++;        
            }
            first++;
            
        }
        
        return t.length() - minSubToAdd;
    }
}