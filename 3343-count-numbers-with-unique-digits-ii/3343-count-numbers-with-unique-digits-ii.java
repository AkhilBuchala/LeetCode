class Solution {
    public int numberCount(int a, int b) {

        int count = 0;

        for(int i = a; i<= b ; i++) {
            String number = String.valueOf(i);
            if(isUnique(number)) {
                count++;
            }
        }
        
        return count ;
    }

    public boolean isUnique(String s) {
        char[] ch = s.toCharArray();
       Set<Character> store = new HashSet<>();
        for(int i=0 ; i<ch.length;i++) {
            if(store.contains(ch[i])){
                return false;
            } else {
                store.add(ch[i]);
            }

        }
        return true;
    }
}