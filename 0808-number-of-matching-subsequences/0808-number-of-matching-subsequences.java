class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        HashMap<String, Integer> store = new HashMap<>();

        for(String st : words) {
            store.put(st, store.getOrDefault(st,0)+1);
        }
        int result = 0;

        for(String st: store.keySet()) {
            if(isSubsequent(st, S)){
                result = result + store.get(st);

            }
        }
        return result; 
}

public boolean isSubsequent(String single, String input) {
    int i=0, j=0, m = single.length(), n=input.length();
    while(i<m && j<n){
        if(single.charAt(i)== input.charAt(j))
           i++;
        j++;   
    }
    return i==m;
}
}
