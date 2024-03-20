class Solution {
    public boolean isValid(String s) {
      
        Stack<Character> check = new Stack<Character>();
        for(char c : s.toCharArray()) {
            if(c == '(')
            
                check.push(')');
            
            else if (c == '{')
            
                check.push('}');
            
            else if (c == '[')
            
                check.push(']');
            else if(check.isEmpty() || c != check.pop()){
                return false;
            }
        }
        return check.isEmpty();
    }
}