class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> store = new Stack();
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++) {
            while(!store.isEmpty() && temperatures[i]>temperatures[store.peek()] ){
                int index = store.pop();
                result[index] = i - index;
            }
            store.push(i);
        }
    
        return result;
    }
}