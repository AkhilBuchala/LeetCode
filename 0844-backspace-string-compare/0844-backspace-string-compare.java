class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> store1 = new Stack();
        Stack<Character> store2 = new Stack();
        char[] first = s.toCharArray();
         char[] second = t.toCharArray();
        for(char ch: first){
            if(ch == '#') {
                if(!store1.isEmpty()) {
                    store1.pop();
                }
            } else {
                store1.push(ch);
            }
        }
        for(char ch: second){
             if(ch == '#') {
                if(!store2.isEmpty()) {
                    store2.pop();
                }
            } else {
                store2.push(ch);
            }
        }
         StringBuilder sss = new StringBuilder();
        while(!store1.isEmpty()) {
            sss.append(store1.pop());
        }

        StringBuilder ttt = new StringBuilder();
        while(!store2.isEmpty()) {
            ttt.append(store2.pop());
        }

        return sss.toString().equals(ttt.toString());
    }
}