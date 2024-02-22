class Solution {
    public int partitionString(String s) {
        Set<Character> store = new HashSet<>();
        int res =0;
        char[] str = s.toCharArray();
      
        for(int i=0;i<str.length; i++) {
            if(store.contains(str[i])){
                res++;
                store.clear();
                store.add(str[i]);
            } else {
                store.add(str[i]);
            }
          
        }
        return res+1;
    }
}