class Solution {
    public int evalRPN(String[] tokens) {
     
        Stack<Integer> store = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")) {
                int a = store.pop();
                int b = store.pop();
                int c = a+b;
                store.push(c);
            }
            else if(i.equals("-")) {
                int a = store.pop();
                int b = store.pop();
                int c = b-a;
                store.push(c);
            }
            else if(i.equals("*")) {
                int a = store.pop();
                int b = store.pop();
                int c = a*b;
                store.push(c);
            }
            else if(i.equals("/")) {
                int a = store.pop();
                int b = store.pop();
                int c = b/a;
                store.push(c);
            } else {
                store.push(Integer.parseInt(i));
            }
        }
        return store.pop();
    }
}