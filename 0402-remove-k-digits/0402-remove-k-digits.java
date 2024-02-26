class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        
        if(k==len)        
            return "0";
        Stack<Character> store = new Stack<>();
        int i=0;
        while(i<len){
            while(k>0 && !store.isEmpty() && num.charAt(i)<store.peek() ){
                store.pop();
                k--;
            }
            store.push(num.charAt(i));
            i++;
        }
        
        while(k>0){
            store.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!store.isEmpty()){
            sb.append(store.pop());
        }
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
       
        return sb.toString();
    }
}