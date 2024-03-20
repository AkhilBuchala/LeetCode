class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack<>();
        for(String i: tokens) {
            if(i.equals("+")){
                int a = ans.pop();
                int b = ans.pop();
                int c = a + b;
                ans.push(c);
            }
            else if (i.equals("-")){
                int a = ans.pop();
                int b = ans.pop();
                int c = b - a;
                ans.push(c);
            }
            else if(i.equals("*")){
                int a = ans.pop();
                int b = ans.pop();
                int c = a * b;
                ans.push(c);
            }
            else if (i.equals("/")){
                int a = ans.pop();
                int b = ans.pop();
                int c = b / a;
                ans.push(c);
            }
            else {
                ans.push(Integer.parseInt(i));
            }
        }
        return ans.pop();
    }
}